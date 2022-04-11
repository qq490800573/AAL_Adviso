package com.iitp.saltlux_talkbot.tts

import com.google.gson.annotations.SerializedName

internal data class TTSRequestBody(
    @SerializedName("text")
    val text: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("uuid")
    val uuid: String
)
