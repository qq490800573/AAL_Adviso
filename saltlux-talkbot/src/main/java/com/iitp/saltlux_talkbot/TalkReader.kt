package com.iitp.saltlux_talkbot

import android.media.MediaPlayer
import java.io.FileInputStream

class TalkReader {

    private var mediaPlayer: MediaPlayer? = null

    fun readTalk(talk: Talk, onCompletion: () -> Unit) {
        if (mediaPlayer == null) mediaPlayer = MediaPlayer()
        runCatching {
            with(mediaPlayer!!) {
                setOnCompletionListener { onCompletion() }
                reset()
                setDataSource(FileInputStream(talk.voiceFilePath).fd)
                prepare()
                start()
            }
        }.exceptionOrNull()?.printStackTrace()
    }

    fun release() {
        mediaPlayer?.release()
        mediaPlayer = null
    }

}