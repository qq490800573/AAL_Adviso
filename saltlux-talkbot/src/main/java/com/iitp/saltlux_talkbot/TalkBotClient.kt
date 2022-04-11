package com.iitp.saltlux_talkbot

import android.content.Context
import com.iitp.saltlux_talkbot.chatbot.Chat
import com.iitp.saltlux_talkbot.chatbot.ChatBot
import com.iitp.saltlux_talkbot.chatbot.ChatBotClient
import com.iitp.saltlux_talkbot.record.Recorder
import com.iitp.saltlux_talkbot.record.VoiceRecorder
import com.iitp.saltlux_talkbot.record.Volume
import com.iitp.saltlux_talkbot.report.BreathsRequestBody
import com.iitp.saltlux_talkbot.report.HeartRateRequestBody
import com.iitp.saltlux_talkbot.report.ReportApiService
import com.iitp.saltlux_talkbot.report.TemperatureRequestBody
import com.iitp.saltlux_talkbot.stt.STT
import com.iitp.saltlux_talkbot.stt.STTClient
import com.iitp.saltlux_talkbot.tts.TTSApiService
import com.iitp.saltlux_talkbot.tts.TTSRequestBody
import com.iitp.saltlux_talkbot.util.getVoiceFile
import com.iitp.saltlux_talkbot.util.writeFile
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import okhttp3.OkHttpClient
import okio.ByteString.Companion.toByteString
import java.util.concurrent.atomic.AtomicInteger

private const val TAG = "TalkBotClient"

internal class TalkBotClient(
    private val context: Context,
    client: OkHttpClient,
) : TalkBot {

    private val chatBot: ChatBot = ChatBotClient(client = client)
    private val sttClient: STT = STTClient(client = client)
    private val ttsApiService: TTSApiService = TTSApiService.getInstance(client = client)
    private val reportApiService: ReportApiService = ReportApiService.getInstance(client = client)
    private val voiceRecorder: Recorder = VoiceRecorder()

    private lateinit var uuid: String
    private var testAnswerSet = emptyList<Talk>().iterator()

    override fun connect(doOnConnect: (() -> Unit)?) {
        chatBot.connect { uuid ->
            this.uuid = uuid
            logD(message = "TalkBot uuid: $uuid")
            sttClient.connect(uuid = uuid)
            doOnConnect?.invoke()
        }
    }

    override fun send(message: String) {
        chatBot.send(message = message)
    }

    override fun receive(): Flow<Talk> {
        val talkFlow = MutableSharedFlow<Talk>(replay = 0)
        val index = AtomicInteger(0)
        chatBot.receive { chat ->
            val talk = chat.toTalk(id = index.getAndIncrement())
            if (talk.type !in listOf(TalkType.SENSOR, TalkType.INFORMATION)) {
                talk.voiceFilePath = getTTSFromChat(chat = chat)
            }
            talkFlow.emit(value = talk)

            // 테스트 모드
            if (testAnswerSet.hasNext()) {
                if (talk.type !in listOf(TalkType.SENSOR, TalkType.INFORMATION)) {
                    val answer = testAnswerSet.next()
                    delay(4000)
                    chatBot.send(message = answer.message)
                    talkFlow.emit(answer)
                }
            }
        }
        sttClient.receive { transcript ->
            talkFlow.emit(transcript.toTalk(id = index.getAndIncrement()))
        }
        return talkFlow
    }

    private suspend fun getTTSFromChat(chat: Chat): String {
        val request = with(chat) {
            TTSRequestBody(text = ttsText, type = type.value, uuid = uuid)
        }
        val body = ttsApiService.postTTS(request)
        val fileName = with(chat) { "$id-$subCategory" }
        val file = getVoiceFile(context = context, fileName = fileName)
        writeFile(file = file, byteStream = body.byteStream(), fileSize = body.contentLength())
        return file.absolutePath
    }

    override fun openMicrophone(): Flow<Volume> {
        val volumeFlow = MutableStateFlow(value = 0)
        sttClient.sendAudioWhileConnected {
            val (data, volume) = voiceRecorder.read()
            volumeFlow.emit(value = volume)
            return@sendAudioWhileConnected data.toByteString()
        }
        return volumeFlow
    }

    override fun startListening() {
        voiceRecorder.startRecording()
    }

    override fun stopListening() {
        voiceRecorder.stopRecording()
    }

    override fun disconnect() {
        chatBot.disconnect()
        sttClient.disconnect()
        voiceRecorder.release()
    }

    override fun setAutoAnswerMode(type: TalkBot.AutoAnswerMode) {
        testAnswerSet = when (type) {
            TalkBot.AutoAnswerMode.NORMAL_RESULT -> testAnswerSetResultNormal.toTalks().iterator()
            TalkBot.AutoAnswerMode.ABNORMAL_RESULT -> testAnswerSetResultAbnormal.toTalks().iterator()
            TalkBot.AutoAnswerMode.NONE -> emptyList<Talk>().iterator()
        }
    }

    override suspend fun reportSensorData(
        temperature: String,
        respiration: String,
        heartRate: String,
    ) {
        if (temperature.isNotEmpty()) {
            val body = TemperatureRequestBody(temperature = temperature, uuid = uuid)
            reportApiService.reportTemperature(body = body)
        }
        if (respiration.isNotEmpty()) {
            val body = BreathsRequestBody(breaths = respiration, uuid = uuid)
            reportApiService.reportBreaths(body = body)
        }
        if (heartRate.isNotEmpty()) {
            val body = HeartRateRequestBody(heartRate = heartRate, uuid = uuid)
            reportApiService.reportHeartRate(body = body)
        }
    }

}
