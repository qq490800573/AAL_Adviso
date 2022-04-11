package com.iitp.saltlux_talkbot.stt

import okio.ByteString

internal interface STT {
    fun connect(uuid: String)
    fun sendAudioWhileConnected(audioProvider: suspend () -> ByteString)
    fun receive(func: suspend (transcript: Transcript) -> Unit)
    fun disconnect()
}