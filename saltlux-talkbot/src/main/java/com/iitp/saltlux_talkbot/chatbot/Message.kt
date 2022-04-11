package com.iitp.saltlux_talkbot.chatbot

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
internal data class Message(
    @SerializedName("type")
    val type: MessageType,
    @SerializedName("category")
    val category: String = "",
    @SerializedName("subCategory")
    val subCategory: String = "",
    @SerializedName("message")
    val message: String = "",
    @SerializedName("ttsMessage")
    val ttsMessage: String?
)

@Keep
internal enum class MessageType(val value: String) {
    @SerializedName("uuid")
    UUID("uuid"),

    @SerializedName("message")
    MESSAGE("message"),

    @SerializedName("information")
    INFORMATION("information"),

    @SerializedName("emergency")
    EMERGENCY("emergency")
}