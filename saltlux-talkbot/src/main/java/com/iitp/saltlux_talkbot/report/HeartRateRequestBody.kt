package com.iitp.saltlux_talkbot.report

import com.google.gson.annotations.SerializedName

internal data class HeartRateRequestBody(
    @SerializedName("heartRate")
    val heartRate: String,
    @SerializedName("uuid")
    val uuid: String,
)
