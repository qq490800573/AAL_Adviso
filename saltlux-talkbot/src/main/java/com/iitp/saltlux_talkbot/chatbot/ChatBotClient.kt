package com.iitp.saltlux_talkbot.chatbot

import com.google.gson.Gson
import com.iitp.saltlux_talkbot.api_base
import com.iitp.saltlux_talkbot.logD
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collectIndexed
import okhttp3.*

private const val chatBotClientUrl = "ws://${api_base}talkbot/client"
private const val CLOSING_STATUS = 1000

internal class ChatBotClient constructor(
    private val client: OkHttpClient
) : ChatBot {

    private var socket: WebSocket? = null
    private var onConnect: ((uuid: String) -> Unit)? = null

    private val scope = CoroutineScope(context = Dispatchers.IO)

    private var mutableSharedFlow = MutableSharedFlow<Message>(replay = 10)
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
            webSocket.close()
        }

        @Synchronized
        override fun onMessage(webSocket: WebSocket, text: String) {
            logD(message = text)
            val message = parseMessage(json = text)
            when (message.type) {
                MessageType.UUID -> onConnect?.invoke(message.message)
                else -> mutableSharedFlow.tryEmit(value = message)
            }
        }

        private val gson = Gson()

        private fun parseMessage(json: String): Message {
            return gson.fromJson(json, Message::class.java)
        }
    }

    override fun connect(doOnConnect: ((uuid: String) -> Unit)?) {
        onConnect = doOnConnect

        socket?.close()
        val request = Request.Builder().url(url = chatBotClientUrl).build()
        socket = client.newWebSocket(request = request, listener = listener)
        logD(message = "connected")
    }

    override fun receive(func: suspend (chat: Chat) -> Unit) {
        receiveJob = scope.launch {
            mutableSharedFlow.collectIndexed { index, message ->
                if (isActive) func(message.toChat(id = index))
            }
        }
    }

    override fun send(message: String) {
        logD(message = "send: $message")
        socket?.send(text = message)
    }

    override fun disconnect() {
        receiveJob?.cancel()
        socket?.close()
    }

    private fun WebSocket.close() {
        this.close(CLOSING_STATUS, null)
    }
}