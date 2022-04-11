package com.iitp.saltlux_talkbot.report

import com.iitp.saltlux_talkbot.api_base
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

private const val ttsBase = "http://$api_base"

internal interface ReportApiService {
    @POST("api/sensor/breaths")
    suspend fun reportBreaths(@Body body: BreathsRequestBody): ResponseBody

    @POST("api/sensor/temperature")
    suspend fun reportTemperature(@Body body: TemperatureRequestBody): ResponseBody

    @POST("api/sensor/heartrate")
    suspend fun reportHeartRate(@Body body: HeartRateRequestBody): ResponseBody

    companion object {
        fun getInstance(client: OkHttpClient): ReportApiService = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ttsBase)
            .build()
            .create(ReportApiService::class.java)
    }
}