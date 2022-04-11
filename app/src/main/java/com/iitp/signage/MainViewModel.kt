package com.iitp.signage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.util.NetworkStatus
import com.iitp.saltlux_talkbot.util.ServerStatusChecker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val serverStatusChecker: ServerStatusChecker
) : ViewModel() {

    private val _networkStatus = MutableStateFlow(NetworkStatus.DISCONNECTED)
    val networkStatus = _networkStatus.asStateFlow()

    private val _step = MutableStateFlow(Step.START)
    val step = _step.asStateFlow()

    private val _backToStartEvent = MutableSharedFlow<Event>()
    val backToStartEvent = _backToStartEvent.asSharedFlow()

    init {
        viewModelScope.launch {
            serverStatusChecker.isAlive.collect { networkStatus ->
                logD(message = "network connection: $networkStatus")
                _networkStatus.emit(networkStatus)
            }
        }
    }

    fun setStep(step: Step) {
        _step.value = step
    }

    fun backToStart() {
        viewModelScope.launch {
            _backToStartEvent.emit(Event)
        }
    }
}

enum class Step {
    START, QUESTIONNAIRE, RESULT_NORMAL, RESULT_ABNORMAL
}