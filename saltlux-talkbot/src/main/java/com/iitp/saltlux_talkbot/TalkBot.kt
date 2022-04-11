package com.iitp.saltlux_talkbot

import android.content.Context
import androidx.annotation.Keep
import com.iitp.saltlux_talkbot.record.Volume
import kotlinx.coroutines.flow.Flow
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

interface TalkBot {
    fun connect(doOnConnect: (() -> Unit)? = null)
    fun send(message: String)
    fun receive(): Flow<Talk>
    fun openMicrophone(): Flow<Volume>
    fun startListening()
    fun stopListening()
    fun disconnect()
    fun setAutoAnswerMode(type: AutoAnswerMode = AutoAnswerMode.NONE)
    suspend fun reportSensorData(temperature: String, respiration: String, heartRate: String)

    @Keep
    enum class AutoAnswerMode {
        NONE, NORMAL_RESULT, ABNORMAL_RESULT
    }

    companion object {

        private val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(timeout = 5, unit = TimeUnit.MINUTES)
            .writeTimeout(timeout = 5, unit = TimeUnit.MINUTES)
            .readTimeout(timeout = 5, unit = TimeUnit.MINUTES)
            .apply {
                if (BuildConfig.DEBUG) addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    }
                )
            }.build()

        fun getInstance(context: Context): TalkBot {
            return TalkBotClient(context = context, client = okHttpClient)
        }
    }
}