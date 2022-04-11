package com.iitp.saltlux_talkbot.report

import com.google.gson.annotations.SerializedName

internal data class BreathsRequestBody(
    @SerializedName("breaths")
    val breaths: String,
    @SerializedName("uuid")
    val uuid: String,
)
