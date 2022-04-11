package com.iitp.saltlux_talkbot.record

import android.media.AudioFormat
import android.media.AudioRecord
import android.media.AudioRecord.*
import android.media.MediaRecorder
import okhttp3.internal.EMPTY_BYTE_ARRAY
import kotlin.math.sqrt

private const val RECORDER_SAMPLE_RATE = 16000
private const val RECORDER_CHANNELS = AudioFormat.CHANNEL_IN_MONO
private const val RECORDER_AUDIO_ENCODING = AudioFormat.ENCODING_PCM_16BIT

internal class VoiceRecorder : Recorder {

    private val recorderBufferSize = getMinBufferSize(
        RECORDER_SAMPLE_RATE,
        RECORDER_CHANNELS,
        RECORDER_AUDIO_ENCODING
    )

    private val audioRecorder = AudioRecord(
        MediaRecorder.AudioSource.VOICE_COMMUNICATION,
        RECORDER_SAMPLE_RATE,
        RECORDER_CHANNELS,
        RECORDER_AUDIO_ENCODING,
        recorderBufferSize
    )

    override fun startRecording() {
        with(audioRecorder) {
            if (state == STATE_INITIALIZED && recordingState == RECORDSTATE_STOPPED) {
                startRecording()
            }
        }
    }

    override fun stopRecording() {
        with(audioRecorder) {
            if (state == STATE_INITIALIZED && recordingState == RECORDSTATE_RECORDING) {
                stop()
            }
        }
    }

    override fun read(): RecordData {
        return audioRecorder.read(sizeInBytes = recorderBufferSize)
    }

    private fun AudioRecord.read(sizeInBytes: Int): RecordData {
        val data = ByteArray(sizeInBytes)
        val readSize = read(data, 0, sizeInBytes)
        return if (readSize > 0) {
            val amplitude = data.copyOf(readSize).fold(0.0) { sum, byte ->
                sum + byte.times(byte)
            }.div(readSize)
            val volume = sqrt(amplitude).toInt()
            data to volume
        } else EMPTY_BYTE_ARRAY to 0
    }

    override fun release() {
        audioRecorder.release()
    }

}