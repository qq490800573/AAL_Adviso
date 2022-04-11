package com.iitp.signage

import android.graphics.Typeface
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iitp.saltlux_talkbot.Talk
import com.iitp.signage.questionnaire.TalkAdapter
import com.iitp.signage.view.WaveView

@BindingAdapter("setBold")
fun TextView.setBold(flag: Boolean) {
    this.setTypeface(this.typeface, if (flag) Typeface.BOLD else Typeface.NORMAL)
}

@BindingAdapter("amplitude")
fun WaveView.setAmplitude(amplitude: Int) {
    setSpeechAmplitude(amplitude)
}

@BindingAdapter("items")
fun RecyclerView.setItems(items: List<Talk>) {
    (this.adapter as TalkAdapter).submitList(items)
    if (items.isNotEmpty()) smoothScrollToPosition(items.lastIndex)
}