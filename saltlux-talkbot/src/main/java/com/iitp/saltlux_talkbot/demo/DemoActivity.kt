package com.iitp.saltlux_talkbot.demo

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.iitp.saltlux_talkbot.*
import com.iitp.saltlux_talkbot.databinding.ActivityDemoBinding
import com.iitp.saltlux_talkbot.util.NetworkStatus
import com.iitp.saltlux_talkbot.util.ServerStatusChecker
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit


private const val TAG = "DemoActivity"

internal class DemoActivity : FragmentActivity() {

    private lateinit var binding: ActivityDemoBinding

    private val context: Context by lazy { this.applicationContext }

    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(timeout = 5, unit = TimeUnit.MINUTES)
        .writeTimeout(timeout = 5, unit = TimeUnit.MINUTES)
        .readTimeout(timeout = 5, unit = TimeUnit.MINUTES)
        .build()

    private val talkBot: TalkBot by lazy {
        TalkBotClient(
            context = context,
            client = okHttpClient
        )
    }
    private val talkReader = TalkReader()

    private val serverStatusChecker = ServerStatusChecker(context = context)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        talkBot.connect()

        CoroutineScope(context = Dispatchers.Main).launch {
            talkBot.receive().collect { talk ->
                talkBot.stopListening()
                if ((talk.type != TalkType.SENSOR) and (talk.talker == Talker.BOT)) {
                    talkReader.readTalk(talk = talk) { talkBot.startListening() }
                }
                when (talk.type) {
                    TalkType.MESSAGE -> displayTalk(talk = talk)
                    TalkType.EMERGENCY -> emergencyTalk(talk = talk)
                    TalkType.END -> finishTalk(talk = talk)
                    TalkType.SENSOR -> sensorTalk(talk = talk)
                    TalkType.INFORMATION -> Unit
                }
            }
        }

        CoroutineScope(context = Dispatchers.Main).launch {
            talkBot.openMicrophone().collect { volume ->
                binding.audioAmp.progress = volume
            }
        }

        CoroutineScope(context = Dispatchers.Main).launch {
            serverStatusChecker.isAlive.collect { networkStatus ->
                binding.networkStatus.text =
                    if (networkStatus == NetworkStatus.CONNECTED) "Connected" else "Disconnected"
            }
        }
    }

    private fun displayTalk(talk: Talk) {
        val message = with(talk) { "${talker.name}($id): $message" }
        when (talk.talker) {
            Talker.USER -> binding.answerText.text = message
            Talker.BOT -> binding.questionText.text = message
        }
    }

    private fun emergencyTalk(talk: Talk) {
        Toast.makeText(this@DemoActivity, talk.message, Toast.LENGTH_SHORT).show()
    }

    private fun finishTalk(talk: Talk) {
        Toast.makeText(this@DemoActivity, talk.message, Toast.LENGTH_SHORT).show()
    }

    private fun sensorTalk(talk: Talk) {
        Toast.makeText(this@DemoActivity, talk.message, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        finish()
        super.onPause()
    }

    override fun onDestroy() {
        talkBot.disconnect()
        talkReader.release()
        super.onDestroy()
    }
}