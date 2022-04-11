package com.iitp.saltlux_talkbot.tts

import com.iitp.saltlux_talkbot.api_base
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

private const val ttsBase = "http://$api_base"

internal interface TTSApiService {
    @POST("tts")
    suspend fun postTTS(@Body body: TTSRequestBody): ResponseBody

    companion object {
        fun getInstance(client: OkHttpClient): TTSApiService = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ttsBase)
            .build()
            .create(TTSApiService::class.java)
    }
}