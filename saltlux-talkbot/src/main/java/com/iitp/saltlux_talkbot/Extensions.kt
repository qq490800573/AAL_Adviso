package com.iitp.saltlux_talkbot

import android.util.Log

fun Any.logD(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}