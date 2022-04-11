package com.iitp.saltlux_talkbot

import android.util.Log
import com.iitp.saltlux_talkbot.chatbot.ChatBot
import com.iitp.saltlux_talkbot.chatbot.ChatBotClient
import junit.framework.TestCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class ChatBotClientTest : TestCase() {


    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(timeout = 5, unit = TimeUnit.MINUTES)
        .writeTimeout(timeout = 5, unit = TimeUnit.MINUTES)
        .readTimeout(timeout = 5, unit = TimeUnit.MINUTES)
        .build()

    private val testRunningTime = 1000L

    fun testGetReceives() = runBlocking {
        val chatBot: ChatBot = ChatBotClient(client = okHttpClient).apply { connect() }
        chatBot.receive {
            Log.d("TEST", "${it.type}  ${it.text}")
        }
        delay(3000)
        for (answer in testAnswerSetResultNormal) {
            chatBot.send(message = answer)
            delay(1000)
        }
        delay(1000 * testRunningTime)
    }

    fun testDisconnect() {}
}