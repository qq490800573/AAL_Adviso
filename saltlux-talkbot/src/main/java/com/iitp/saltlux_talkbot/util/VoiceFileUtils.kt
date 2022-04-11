package com.iitp.saltlux_talkbot.util

import android.content.Context
import android.util.Log
import com.iitp.saltlux_talkbot.BuildConfig
import java.io.*

internal fun getVoiceFile(context: Context, fileName: String): File {
    val voiceDir = File("${context.cacheDir.path}${File.separator}voice")
    if (!voiceDir.exists()) voiceDir.mkdirs()
    return File("${voiceDir.path}${File.separator}$fileName.wav")
}

internal fun clearVoiceFiles(context: Context) {
    val voiceDir = File("${context.cacheDir.path}${File.separator}voice")
    voiceDir.deleteRecursively()
}

internal fun writeFile(file: File, byteStream: InputStream, fileSize: Long): Boolean {
    return try {
        if (file.exists()) {
            file.delete()
        }
        var inputStream: InputStream? = null
        var outputStream: OutputStream? = null
        try {
            val fileReader = ByteArray(4096)
            var fileSizeDownloaded = 0

            inputStream = byteStream
            outputStream = FileOutputStream(file)
            while (true) {
                val read = inputStream.read(fileReader)
                if (read == -1) {
                    break
                }
                outputStream.write(fileReader, 0, read)
                fileSizeDownloaded += read
            }
            outputStream.flush()
            if (BuildConfig.DEBUG) Log.d(
                "writeWavFile",
                "file downloaded: $fileSizeDownloaded of $fileSize"
            )
            true
        } catch (e: IOException) {
            e.printStackTrace()
            false
        } finally {
            inputStream?.close()
            outputStream?.close()
        }
    } catch (e: IOException) {
        false
    }
}