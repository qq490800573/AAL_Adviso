package com.iitp.signagekiosk.util

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.iitp.saltlux_talkbot.BuildConfig
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Fragment.toast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
}

fun Fragment.toast(@StringRes resId: Int) {
    Toast.makeText(requireContext(), getString(resId), Toast.LENGTH_SHORT).show()
}

private fun fullScreen(window: Window, view: View) {
    WindowInsetsControllerCompat(window, view)
        .hide(WindowInsetsCompat.Type.systemBars())
}

fun Activity.fullScreen(view: View) {
    fullScreen(this.window, view)
}

fun DialogFragment.fullScreen(view: View) {
    requireDialog().window?.let {
        fullScreen(it, view)
    }
}

fun <T> FragmentActivity.repeatOnStarted(flow: Flow<T>, action: suspend (value: T) -> Unit) {
    lifecycleScope.launch {
        repeatOnLifecycle(Lifecycle.State.STARTED) {
            flow.collect(action)
        }
    }
}

fun <T> Fragment.repeatOnStarted(flow: Flow<T>, action: suspend (value: T) -> Unit) {
    viewLifecycleOwner.lifecycleScope.launch {
        repeatOnLifecycle(Lifecycle.State.STARTED) {
            flow.collect(action)
        }
    }
}

fun Any.logD(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}