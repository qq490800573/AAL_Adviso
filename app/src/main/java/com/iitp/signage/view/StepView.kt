package com.iitp.signage.view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.databinding.BindingAdapter
import com.iitp.signage.R
import com.iitp.signage.Step
import com.iitp.signage.databinding.LayoutStepBinding

class StepView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val colorBlueGrey by lazy { resources.getColor(R.color.blue_grey, null) }
    private val colorDarkGreyBlue by lazy { resources.getColor(R.color.dark_grey_blue, null) }
    private val colorRed by lazy { resources.getColor(R.color.red, null) }
    private val colorBlue by lazy { resources.getColor(R.color.blue, null) }
    private val colorPaleLilac by lazy { resources.getColor(R.color.pale_lilac, null) }

    private val binding = LayoutStepBinding.inflate(LayoutInflater.from(context), this, true)

    fun layoutStepIndicator(step: Step) {
        visibility = when (step) {
            Step.START -> INVISIBLE
            else -> VISIBLE
        }
        with(binding) {
            when (step) {
                Step.START -> {
                    clearStep()
                    icStep1.setImageResource(R.drawable.ic_step_selected)
                    textStep1.apply {
                        setTextColor(colorDarkGreyBlue)
                        setTypeface(typeface, Typeface.BOLD)
                    }
                }
                Step.QUESTIONNAIRE -> {
                    textStep1.apply {
                        setTextColor(colorBlueGrey)
                        setTypeface(typeface, Typeface.NORMAL)
                    }
                    lineStep12.setBackgroundColor(colorBlue)
                    icStep2.setImageResource(R.drawable.ic_step_selected)
                    textStep2.apply {
                        setTextColor(colorDarkGreyBlue)
                        setTypeface(typeface, Typeface.BOLD)
                    }
                }
                Step.RESULT_NORMAL -> {
                    textStep2.apply {
                        setTextColor(colorBlueGrey)
                        setTypeface(typeface, Typeface.NORMAL)
                    }
                    lineStep23.setBackgroundColor(colorBlue)
                    icStep3.setImageResource(R.drawable.ic_step_selected)
                    textStep3.apply {
                        setTextColor(colorDarkGreyBlue)
                        setTypeface(typeface, Typeface.BOLD)
                    }
                }
                Step.RESULT_ABNORMAL -> {
                    textStep2.apply {
                        setTextColor(colorBlueGrey)
                        setTypeface(typeface, Typeface.NORMAL)
                    }
                    lineStep23.setBackgroundResource(R.drawable.step_abnormal_gradient)
                    icStep3.setImageResource(R.drawable.ic_step_selected_abnormal)
                    textStep3.apply {
                        setTextColor(colorRed)
                        setTypeface(typeface, Typeface.BOLD)
                    }
                }
            }
        }
    }


    private fun clearStep() {
        with(binding) {
            icStep1.setImageResource(R.drawable.ic_step_normal)
            textStep1.apply {
                setTextColor(colorBlueGrey)
                setTypeface(typeface, Typeface.NORMAL)
            }

            lineStep12.setBackgroundColor(colorPaleLilac)

            icStep2.setImageResource(R.drawable.ic_step_normal)
            textStep2.apply {
                setTextColor(colorBlueGrey)
                setTypeface(typeface, Typeface.NORMAL)
            }

            lineStep23.setBackgroundColor(colorPaleLilac)

            icStep3.setImageResource(R.drawable.ic_step_normal)
            textStep3.apply {
                setTextColor(colorBlueGrey)
                setTypeface(typeface, Typeface.NORMAL)
            }
        }
    }

}

@BindingAdapter("step")
fun StepView.setStep(step: Step) {
    layoutStepIndicator(step = step)
}