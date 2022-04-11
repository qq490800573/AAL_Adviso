package com.iitp.signage.start

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.TalkBot
import com.iitp.saltlux_talkbot.util.NetworkStatus
import com.iitp.saltlux_talkbot.util.ServerStatusChecker
import com.iitp.signage.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class StartViewModel @Inject constructor(
    serverStatusChecker: ServerStatusChecker
) : ViewModel() {

    private val _nextStepEvent = MutableSharedFlow<TalkBot.AutoAnswerMode>()
    val nextStepEvent = _nextStepEvent.asSharedFlow()

    private val _networkErrorEvent = MutableSharedFlow<Event>()
    val networkErrorEvent = _networkErrorEvent.asSharedFlow()

    private val serverStatus = serverStatusChecker.isAlive

    fun startQuestionnaire() {
        viewModelScope.launch {
            when (serverStatus.value) {
                NetworkStatus.CONNECTED -> _nextStepEvent.emit(TalkBot.AutoAnswerMode.NONE)
                NetworkStatus.DISCONNECTED -> _networkErrorEvent.emit(Event)
            }
        }
    }

    fun startQuestionnaireTestNormal() {
        viewModelScope.launch {
            when (serverStatus.value) {
                NetworkStatus.CONNECTED -> _nextStepEvent.emit(TalkBot.AutoAnswerMode.NORMAL_RESULT)
                NetworkStatus.DISCONNECTED -> _networkErrorEvent.emit(Event)
            }
        }
    }

    fun startQuestionnaireTestAbnormal() {
        viewModelScope.launch {
            when (serverStatus.value) {
                NetworkStatus.CONNECTED -> _nextStepEvent.emit(TalkBot.AutoAnswerMode.ABNORMAL_RESULT)
                NetworkStatus.DISCONNECTED -> _networkErrorEvent.emit(Event)
            }
        }
    }
}