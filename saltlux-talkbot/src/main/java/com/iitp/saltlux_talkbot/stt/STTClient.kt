package com.iitp.saltlux_talkbot.stt

import com.google.gson.Gson
import com.iitp.saltlux_talkbot.api_base
import com.iitp.saltlux_talkbot.logD
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import okhttp3.*
import okio.ByteString

private const val sttClientUrl = "ws://${api_base}stt/client/"
private const val CLOSING_STATUS = 1000
private const val TAG = "STTClient"

internal class STTClient constructor(
    private val client: OkHttpClient
) : STT {

    private var socket: WebSocket? = null
    private var recordJob: Job? = null

    private var mutableSharedFlow = MutableSharedFlow<Transcript>()
    private var receiveJob: Job? = null

    private val listener = object : WebSocketListener() {
        override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
            logD(message = "onClosed code $code reason $reason")
            socket = null
        }

        override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
            webSocket.close()
        }

        override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
            t.printStackTrace()
            webSocket.close()
        }

        override fun onMessage(webSocket: WebSocket, text: String) {
            logD(message = text)
            CoroutineScope(context = Dispatchers.IO).launch {
                mutableSharedFlow.emit(value = parseTranscript(json = text))
            }
        }

        private val gson = Gson()

        @Synchronized
        private fun parseTranscript(json: String): Transcript {
            return gson.fromJson(json, Transcript::class.java)
        }
    }

    override fun connect(uuid: String) {
        this.socket?.close()
        val request = Request.Builder().url(url = "$sttClientUrl$uuid").build()
        this.socket = client.newWebSocket(request = request, listener = listener)
        logD(message = "connected")
    }

    override fun sendAudioWhileConnected(audioProvider: suspend () -> ByteString) {
        recordJob = CoroutineScope(context = Dispatchers.IO).launch {
            while (isActive) {
                val bytes = audioProvider()
                if (bytes.size != 0) socket?.send(bytes)
            }
        }
    }

    override fun receive(func: suspend (transcript: Transcript) -> Unit) {
        receiveJob = CoroutineScope(context = Dispatchers.IO).launch {
            mutableSharedFlow.collect { if (isActive) func(it) }
        }
    }

    override fun disconnect() {
        recordJob?.cancel()
        receiveJob?.cancel()
        socket?.close()
    }

    private fun WebSocket.close() {
        this.close(CLOSING_STATUS, null)
    }
}