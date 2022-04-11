package com.iitp.saltlux_talkbot.record

internal typealias Volume = Int
internal typealias RecordData = Pair<ByteArray, Volume>

internal interface Recorder {
    fun startRecording()
    fun stopRecording()
    fun read(): RecordData
    fun release()
}