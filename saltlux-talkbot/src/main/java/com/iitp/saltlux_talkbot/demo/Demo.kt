package com.iitp.saltlux_talkbot.demo

import android.content.Context
import android.content.Intent

object Demo {
    fun start(appContext: Context) {
        appContext.startActivity(
            Intent(appContext, DemoActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
        )
    }
}