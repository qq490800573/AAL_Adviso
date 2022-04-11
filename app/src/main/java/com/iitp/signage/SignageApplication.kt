package com.iitp.signage

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

typealias Event = Unit

@HiltAndroidApp
class SignageApplication : Application()