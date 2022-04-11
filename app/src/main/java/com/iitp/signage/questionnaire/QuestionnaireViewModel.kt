package com.iitp.signage.questionnaire

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.*
import com.iitp.signage.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionnaireViewModel @Inject constructor(
    application: Application,
    private val talkBot: TalkBot,
    private val talkReader: TalkReader,
    savedStateHandle: SavedStateHandle
) : AndroidViewModel(application) {

    private val _talks = MutableStateFlow<List<Talk>>(emptyList())
    val talks = _talks.asStateFlow()

    private val _voiceVolume = MutableStateFlow(0)
    val voiceVolume = _voiceVolume.asStateFlow()

    private val _emergencyDialogEvent = MutableSharedFlow<Talk>()
    val emergencyDialogEvent = _emergencyDialogEvent.asSharedFlow()

    private val _navigateToResultAbnormalEvent = MutableSharedFlow<Talk>()
    val navigateToResultAbnormalEvent = _navigateToResultAbnormalEvent.asSharedFlow()

    private val _navigateToResultNormalEvent = MutableSharedFlow<Event>()
    val navigateToResultNormalEvent = _navigateToResultNormalEvent.asSharedFlow()

    init {
        talkBot.setAutoAnswerMode(
            type = QuestionnaireFragmentArgs.fromSavedStateHandle(
                savedStateHandle
            ).testType
        )

        talkBot.connect()

        viewModelScope.launch {
            talkBot.openMicrophone().collect { volume ->
                _voiceVolume.emit(volume)
            }
        }

        viewModelScope.launch {
            delay(1000) // 안전한 tts 서버 연결을 위한 대기시간.
            talkBot.receive().collect { talk ->
                talkBot.stopListening()
                if ((talk.type != TalkType.SENSOR) and (talk.talker == Talker.BOT)) {
                    talkReader.readTalk(talk = talk) {
                        when (talk.type) {
                            TalkType.END -> finishTalk()
                            else -> talkBot.startListening()
                        }
                    }
                }
                when (talk.type) {
                    TalkType.MESSAGE, TalkType.END -> displayTalk(talk = talk)
                    TalkType.EMERGENCY -> emergencyTalk(talk = talk)
                    TalkType.SENSOR -> sensorTalk(talk = talk)
                }
            }
        }

    }

    private suspend fun displayTalk(talk: Talk) {
        val currentTalks = _talks.value
        val newList = currentTalks.plus(element = talk)
        _talks.emit(newList)
    }

    private fun emergencyTalk(talk: Talk) {
        viewModelScope.launch {
            talkReader.readTalk(talk = talk) { navigateToResultAbnormal(talk = talk) }
            _emergencyDialogEvent.emit(talk)
        }
    }

    private fun navigateToResultAbnormal(talk: Talk) {
        viewModelScope.launch { _navigateToResultAbnormalEvent.emit(talk) }
    }

    private fun finishTalk() {
        viewModelScope.launch { _navigateToResultNormalEvent.emit(Event) }
    }

    private fun sensorTalk(talk: Talk) {
        logD(message = "${talk.type.name}: ${talk.message}")
    }

    override fun onCleared() {
        talkBot.disconnect()
        talkReader.release()
        super.onCleared()
    }
}