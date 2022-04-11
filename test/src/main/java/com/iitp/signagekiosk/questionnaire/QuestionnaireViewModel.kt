package com.iitp.signagekiosk.questionnaire

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.*
import com.iitp.signagekiosk.Event
import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuestionnaireViewModel @Inject constructor(
    private val talkBot: TalkBot,
    private val talkReader: TalkReader,
    private val sensor: Sensor,
) : ViewModel() {

    private val _question = MutableStateFlow("")
    val question = _question.asStateFlow()

    private val _answerType = MutableStateFlow(AnswerType.NONE)
    val answerType = _answerType.asStateFlow()

    private val _canGoPrevious = MutableStateFlow(false)
    val canGoPrevious = _canGoPrevious.asStateFlow()

    private val _prevAnswer = MutableStateFlow("")
    val prevAnswer = _prevAnswer.asStateFlow()

    private val _voiceVolume = MutableStateFlow(0)
    val voiceVolume = _voiceVolume.asStateFlow()

    val voiceOn = voiceVolume.map { it > 0 }.distinctUntilChanged()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = false
        )

    private val _temperature = MutableStateFlow("")
    val temperature = _temperature.asStateFlow()

    private val _respiration = MutableStateFlow("")
    val respiration = _respiration.asStateFlow()

    private val _heartRate = MutableStateFlow("")
    val heartRate = _heartRate.asStateFlow()

    val motion = sensor.motion
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = false
        )

    private val _navigateToIntroEvent = MutableSharedFlow<Event>()
    val navigateToIntroEvent = _navigateToIntroEvent.asSharedFlow()

    private val _onStep3 = MutableStateFlow(false)
    val onStep3 = _onStep3.asStateFlow()

    private val _resultNormal = MutableStateFlow(false)
    val resultNormal = _resultNormal.asStateFlow()

    private val _showEmergencyDialogEvent = MutableSharedFlow<String>()
    val showEmergencyDialogEvent = _showEmergencyDialogEvent.asSharedFlow()

    private val _dismissEmergencyDialogEvent = MutableSharedFlow<Event>()
    val dismissEmergencyDialogEvent = _dismissEmergencyDialogEvent.asSharedFlow()

    private val _resultAbnormal = MutableStateFlow(false)
    val resultAbnormal = _resultAbnormal.asStateFlow()

    private val _resultAbnormalContent = MutableStateFlow("")
    val resultAbnormalContent = _resultAbnormalContent.asStateFlow()

    init {
        talkBot.setAutoAnswerMode(TalkBot.AutoAnswerMode.NONE)

        talkBot.connect {
            measureTemperature()
            startSensorMeasurement()
        }

        viewModelScope.launch {
            talkBot.openMicrophone().collect { volume ->
                _voiceVolume.emit(volume)
            }
        }

        viewModelScope.launch {
            delay(1000)
            talkBot.receive().collect { talk ->
                if (talk.type != TalkType.SENSOR) talkBot.stopListening()
                when (talk.type) {
                    TalkType.MESSAGE, TalkType.END -> {
                        if (talk.talker == Talker.BOT) {
                            readTalk(talk = talk)
                            displayTalk(talk = talk)
                        }
                    }
                    TalkType.INFORMATION -> displayInformation(talk = talk)
                    TalkType.EMERGENCY -> emergencyTalk(talk = talk)
                    TalkType.SENSOR -> sensorTalk(talk = talk)
                }
            }
        }
    }

    private fun readTalk(talk: Talk) {
        talkReader.readTalk(talk = talk) {
            when (talk.type) {
                TalkType.END -> normalFinishTalk()
                else -> talkBot.startListening()
            }
        }
    }

    private fun normalFinishTalk() {
        viewModelScope.launch {
            _onStep3.emit(true)
            _resultNormal.emit(true)
        }
    }

    private fun displayTalk(talk: Talk) {
        _question.value = talk.message
        _answerType.value = talk.answerType
        _canGoPrevious.value = talk.canGoPrevious
    }

    private fun displayInformation(talk: Talk) {
        _prevAnswer.value = talk.message
    }

    private fun emergencyTalk(talk: Talk) {
        talkReader.release()
        viewModelScope.launch {
            _showEmergencyDialogEvent.emit(value = talk.message)
            delay(4000)
            abnormalFinishTalk(text = talk.message)
        }
    }

    private suspend fun abnormalFinishTalk(text: String) {
        _dismissEmergencyDialogEvent.emit(Event)
        _onStep3.emit(value = true)
        _resultAbnormal.emit(value = true)
        _resultAbnormalContent.emit(value = text)
    }

    private fun sensorTalk(talk: Talk) {
        logD(message = "${talk.type.name}: ${talk.message}")
    }

    private fun measureTemperature() {
        viewModelScope.launch {
            val bodyTemp = sensor.receiveSensorData.first().bodyTemp
            val bodyTempValue = "%.1f".format(bodyTemp)
            _temperature.emit(bodyTempValue)
            talkBot.reportSensorData(temperature = bodyTempValue, "", "")
        }
    }

    private fun startSensorMeasurement() {
        viewModelScope.launch {
            val sensorData = sensor.startSensorMeasurement()
            val respiration = "${sensorData.breath.toInt()}"
            val heartRate = "${sensorData.heartRate.toInt()}"
            _respiration.emit(respiration)
            _heartRate.emit(heartRate)
            talkBot.reportSensorData("", respiration = respiration, heartRate = heartRate)
        }
    }

    fun onClickToHome() {
        viewModelScope.launch { _navigateToIntroEvent.emit(Event) }
    }

    override fun onCleared() {
        talkBot.disconnect()
        talkReader.release()
        super.onCleared()
    }

}