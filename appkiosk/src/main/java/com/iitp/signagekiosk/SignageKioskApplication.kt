package com.iitp.signagekiosk

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

typealias Event = Unit
typealias DoNothing = Unit

@HiltAndroidApp
class SignageKioskApplication : Application()