package com.iitp.saltlux_talkbot.stt

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Transcript(
    @SerializedName("id")
    val id: Int,
    @SerializedName("transcript")
    val text: String
)
