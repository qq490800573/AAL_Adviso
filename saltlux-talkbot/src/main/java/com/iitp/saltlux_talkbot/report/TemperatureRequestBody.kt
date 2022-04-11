package com.iitp.saltlux_talkbot.report

import com.google.gson.annotations.SerializedName

internal data class TemperatureRequestBody(
    @SerializedName("temperature")
    val temperature: String,
    @SerializedName("uuid")
    val uuid: String,
)
