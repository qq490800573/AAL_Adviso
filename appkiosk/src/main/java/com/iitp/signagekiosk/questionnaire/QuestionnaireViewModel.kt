package com.iitp.signagekiosk.questionnaire

import androidx.lifecycle.ViewModel
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.*
import com.iitp.signagekiosk.Event
import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.hilt.android.lifecycle.HiltViewModel
//import hilt_aggregated_deps._com_iitp_signagekiosk_questionnaire_QuestionnaireViewModel_HiltModules_BindsModule
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import com.iitp.signagekiosk.R


@HiltViewModel
class QuestionnaireViewModel @Inject constructor(
    private val talkBot: TalkBot,
    private val talkReader: TalkReader,
    private val sensor: Sensor,



) : ViewModel() {
    private val test = 1

    private val _question = MutableStateFlow("")
    val question = _question.asStateFlow()
    private val _next1 = MutableStateFlow("")
    val next1=_next1.asStateFlow()

    private val _question1 = MutableStateFlow("")
    val question1 = _question1.asStateFlow()

    private val _question2 = MutableStateFlow("")
    val question2 = _question2.asStateFlow()

    private val _question3 = MutableStateFlow("")
    val question3 = _question3.asStateFlow()
    private val _answerType = MutableStateFlow(AnswerType.NONE)
    val answerType = _answerType.asStateFlow()

    private val _answerType1 = MutableStateFlow("")
    val answerType1 = _answerType1.asStateFlow()

    private val _normalanswer = MutableStateFlow("")
    val normalanswer = _normalanswer.asStateFlow()

    private val _normalanswer1 = MutableStateFlow("")
    val normalanswer1 = _normalanswer1.asStateFlow()

    private val _normalanswer2 = MutableStateFlow("")
    val normalanswer2 = _normalanswer2.asStateFlow()

    private val _abnormalanswer = MutableStateFlow("")
    val abnormalanswer= _abnormalanswer.asStateFlow()

    private val _abnormalanswer1 = MutableStateFlow("")
    val abnormalanswer1= _abnormalanswer1.asStateFlow()

    private val _abnormalanswer2 = MutableStateFlow("")
    val abnormalanswer2= _abnormalanswer2.asStateFlow()

    private val _abnormalanswer3 = MutableStateFlow("")
    val abnormalanswer3= _abnormalanswer3.asStateFlow()

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

    private val _temperature1 = MutableStateFlow("")
    val temperature1 = _temperature1.asStateFlow()

    private val _respiration1 = MutableStateFlow("")
    val respiration1 = _respiration1.asStateFlow()

    private val _heartRate1 = MutableStateFlow("")
    val heartRate1 = _heartRate1.asStateFlow()

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

    private val _result = MutableStateFlow(false)
    val result = _result.asStateFlow()

    private val _result1 = MutableStateFlow(false)
    val result1 = _result1.asStateFlow()

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
        measureTemperature()
        startSensorMeasurement()
        displayTalk()

        /*talkBot.connect {
            measureTemperature()
            startSensorMeasurement()
        }*/

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
                            //displayTalk(talk = talk)
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

    private fun displayTalk() {

        viewModelScope.launch {
            _question.value = "지금부터 문진을 시작하겠습니다. \n 본인의 성별을 선택해주세요"
        }
        ///
        //_canGoPrevious.value = talk.canGoPrevious
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
            //_temperature.emit(bodyTempValue)
            //talkBot.reportSensorData(temperature = bodyTempValue, "", "")

        }
    }

    private fun startSensorMeasurement() {
        viewModelScope.launch {
            val bodyTemp = sensor.receiveSensorData.first().bodyTemp
            val bodyTempValue = "%.1f".format(bodyTemp + 1)
            _temperature.emit(bodyTempValue)
            val sensorData = sensor.startSensorMeasurement()
            val respiration = "${sensorData.breath.toInt()}"
            val heartRate = "${sensorData.heartRate.toInt()}"

            _respiration.emit(respiration)
            _heartRate.emit(heartRate)
            _temperature.emit(bodyTempValue)
            //_onStep3.emit(true)

           if (respiration.toDouble() > 25 || heartRate.toDouble() > 100 ||  respiration.toDouble() < 8 || heartRate.toDouble() < 50 || bodyTempValue.toDouble() > 37.5 ||  bodyTempValue.toDouble() < 34 ){
                    if(heartRate.toDouble()  > 100 || heartRate.toDouble() <50) {
                        _abnormalanswer.emit("심박 주의 필요: " + heartRate + " !")
                    }
                    if(respiration.toDouble() > 25 || respiration.toDouble() < 8)  {
                        _abnormalanswer1.emit("호흡 주의 필요: " + respiration + " !")
                    }
                    if(bodyTempValue.toDouble() > 37.5 ||  bodyTempValue.toDouble() < 34 ) {
                        _abnormalanswer2.emit("체온 주의 필요" + bodyTempValue + "!")
                    }
                    _resultAbnormal.emit(true)
                    _onStep3.emit(true)
            }
            else {
                _normalanswer.emit("심박: "+heartRate)
                _normalanswer1.emit("호흡: " + respiration)
                _normalanswer2.emit("체온: " + bodyTempValue)
                _resultNormal.emit(true)
                _onStep3.emit(true)
            }
            //talkBot.reportSensorData("", respiration = respiration, heartRate = heartRate)

        }
    }


    fun onClickToHome() {
        viewModelScope.launch { _navigateToIntroEvent.emit(Event) }
    }


    fun onClickToFinal(){
        viewModelScope.launch{
            _result.emit(true)
            _resultNormal.emit(false)
        }
    }
    fun onClickToFinal1(){

        viewModelScope.launch{
            _result1.emit(false)
            _resultAbnormal.emit(false)
        }
    }
    override fun onCleared() {
        talkBot.disconnect()
        talkReader.release()
        super.onCleared()
    }

}


