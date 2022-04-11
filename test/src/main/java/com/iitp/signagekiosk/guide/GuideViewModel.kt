package com.iitp.signagekiosk.guide

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.vital_sensor.PositionState
import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class GuideViewModel @Inject constructor(
    sensor: Sensor,
) : ViewModel() {

    val drawableResId = sensor.positionState.map {
        when (it) {
            PositionState.CLOSE -> R.drawable.guide_close
            PositionState.FIT -> R.drawable.guide_fit
            PositionState.FAR -> R.drawable.guide_far
            PositionState.GONE -> R.drawable.guide_gone
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = R.drawable.guide_gone
    )

    val warningResId = sensor.positionState.map {
        when (it) {
            PositionState.CLOSE -> R.string.guide_warning_close
            PositionState.FIT -> R.string.empty_description
            PositionState.FAR -> R.string.guide_warning_far
            PositionState.GONE -> R.string.guide_warning_gone
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = R.string.guide_warning_gone
    )

    val warningTagVisible = sensor.positionState.map {
        when (it) {
            PositionState.FIT -> false
            else -> true
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = true
    )

}