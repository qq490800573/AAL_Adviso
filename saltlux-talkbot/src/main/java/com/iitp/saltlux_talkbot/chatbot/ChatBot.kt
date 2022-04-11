package com.iitp.saltlux_talkbot.chatbot

internal interface ChatBot {
    fun connect(doOnConnect: ((uuid: String) -> Unit)? = null)
    fun receive(func: suspend (chat: Chat) -> Unit)
    fun send(message: String)
    fun disconnect()
}