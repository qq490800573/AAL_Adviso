package com.iitp.signagekiosk.loading

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.signagekiosk.Event
import com.iitp.signagekiosk.vital_sensor.PositionState
import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoadingViewModel @Inject constructor(
    sensor: Sensor,
) : ViewModel() {

    private val sample = 100
    private val loadingSecond = 3
    val progressMax = loadingSecond * sample

    private var waitingJob: Job? = null
    private val waitingTimeMillis = 4000L

    private val _guideCompleteEvent = MutableSharedFlow<Event>()
    val guideCompleteEvent = _guideCompleteEvent.asSharedFlow()

    private val _progress = MutableStateFlow(0)
    val progress = _progress.asStateFlow()

    private val _remainSecond = MutableStateFlow(loadingSecond)
    val remainSecond = _remainSecond.asStateFlow()

    private val _loadingCompleteEvent = MutableSharedFlow<Event>()
    val loadingCompleteEvent = _loadingCompleteEvent.asSharedFlow()

    init {
        viewModelScope.launch {
            sensor.positionState.distinctUntilChanged().collect {
                when (it) {
                    PositionState.FIT -> waitingJob = launch { waitingForGuideComplete() }
                    else -> waitingJob?.cancel()
                }
            }
        }

        viewModelScope.launch {
            guideCompleteEvent.collect {
                startProgress()
            }
        }
    }

    private suspend fun waitingForGuideComplete() {
        delay(waitingTimeMillis)
        _guideCompleteEvent.emit(Event)
    }

    private suspend fun startProgress() {
        repeat(progressMax) {
            if (it.rem(sample) == 0) _remainSecond.emit(loadingSecond - it.div(sample))
            val count = it + 1
            _progress.emit(count)
            delay((1000 / sample).toLong())
        }
        _loadingCompleteEvent.emit(Event)
    }

}