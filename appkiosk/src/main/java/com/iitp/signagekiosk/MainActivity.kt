package com.iitp.signagekiosk

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.iitp.signagekiosk.databinding.ActivityMainBinding
import com.iitp.signagekiosk.util.fullScreen
import com.iitp.signagekiosk.util.repeatOnStarted
import com.iitp.signagekiosk.vital_sensor.Detection
import com.iitp.signagekiosk.vital_sensor.SensorActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.TalkBot
import com.iitp.saltlux_talkbot.TalkReader

import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.first
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_questionnaire)


        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            lifecycleOwner = this@MainActivity
        }
        setContentView(binding.root)
        fullScreen(binding.root)

        binding.sensorMonitor.setOnClickListener {
            startActivity(Intent(this, SensorActivity::class.java))
        }

        repeatOnStarted(viewModel.detection) {
            when (it) {
                //Detection.IDLE -> backToIntro()
                Detection.IDLE -> DoNothing
                else -> DoNothing
            }
        }

        repeatOnStarted(viewModel.connectionStatus) {
            when (it) {
                ConnectionStatus.CONNECT -> dismissDisconnectionDialog()
                else -> showDisconnectDialog(it)
            }
        }
    }
    /*private suspend fun measureTemperature(sensor: Sensor,view: View) {
        val sensorData = sensor.startSensorMeasurement()
        val bodytemp = "${"%.1f".format(sensorData.bodyTemp)}"
        val respiration = "${sensorData.breath.toInt()}"
        val heartRate = "${sensorData.heartRate.toInt()}"
        val report1: TextView = findViewById(R.id.textView201)
        val report2: TextView = findViewById(R.id.textView202)
        val report3: TextView = findViewById(R.id.textView203)

        if (respiration.toDouble() > 25 || heartRate.toDouble() > 100 ||  respiration.toDouble() < 8 || heartRate.toDouble() < 50 || bodytemp.toDouble() > 37.5 ||  bodytemp.toDouble() < 34 ){
            if(heartRate.toDouble()  > 100 || heartRate.toDouble() <50) {
                report1.text = "심박 주의 필요: " + heartRate + " !"
            }
            if(respiration.toDouble() > 25 || respiration.toDouble() < 8)  {
                report2.text = "호흡 주의 필요: " + respiration + " !"
            }
            if(bodytemp.toDouble() > 37.5 ||  bodytemp.toDouble() < 34 ) {
                report3.text = "체온 주의 필요" + bodytemp + "!"
            }

        }
        else {
            report1.text = "심박: "+heartRate
            report2.text = "호흡: " + respiration
            report3.text = "체온: " + bodytemp

        }
    }*/
    fun testButtonClicked(view: View){
        val test: Button = findViewById(R.id.but4)
        test.setVisibility(View.INVISIBLE)
        val testtv: TextView = findViewById(R.id.textView32)
        testtv.text = "기저질환 유무를 선택해주세요."
        view.setVisibility(View.INVISIBLE)
    }
    fun testButtonClicked1(view: View){
        val test: Button = findViewById(R.id.but3)
        test.setVisibility(View.INVISIBLE)
        val testtv: TextView = findViewById(R.id.textView32)
        testtv.text = "기저질환 유무를 선택해주세요."
        view.setVisibility(View.INVISIBLE)
    }
    fun testButtonClicked2(view: View){
        val test: Button = findViewById(R.id.but2)
        test.setVisibility(View.INVISIBLE)
        val testtv: TextView = findViewById(R.id.textView32)
        testtv.text = "본인의 연령을 입력 해주세요(숫자만 입력)"
        view.setVisibility(View.INVISIBLE)
    }
    fun testButtonClicked3(view: View){
        val test: Button = findViewById(R.id.but1)
        test.setVisibility(View.INVISIBLE)
        val testtv: TextView = findViewById(R.id.textView32)
        testtv.text = "본인의 연령을 입력 해주세요(숫자만 입력)"
        view.setVisibility(View.INVISIBLE)
    }
    fun testButtonClicked4(view: View){
        val test: Button = findViewById(R.id.but5)
        test.setVisibility(View.INVISIBLE)
        val testtv: TextView = findViewById(R.id.textView32)
        testtv.text = "결과가 나올 때까지 기다려 주세요."
        view.setVisibility(View.INVISIBLE)
        val test1: TextView = findViewById(R.id.EditText1)
        test1.setVisibility(View.INVISIBLE)

    }
    fun testButtonClicked5(view: View){
        val intent = Intent()
        intent.setClass(this,SensorActivity::class.java)
        startActivity(intent)
    }
    override fun onPause() {
        super.onPause()
        backToIntro()
    }

    private fun backToIntro() {
        val action = NavGraphDirections.actionGlobalIntroFragment()
        findNavController(R.id.nav_host_fragment).navigate(action)
    }

    private fun dismissDisconnectionDialog() {
        val navController = findNavController(R.id.nav_host_fragment)
        val currentDestinationId = navController.currentDestination?.id
        if (currentDestinationId == R.id.disconnectionDialog) {
            navController.popBackStack()
        }
    }

    private fun showDisconnectDialog(status: ConnectionStatus) {
        val navController = findNavController(R.id.nav_host_fragment)
        val currentDestinationId = navController.currentDestination?.id
        if (currentDestinationId != R.id.disconnectionDialog) {
            backToIntro()
            lifecycleScope.launch {
                delay(1000)
                val action = NavGraphDirections.actionGlobalDisconnectionDialog(status)
                findNavController(R.id.nav_host_fragment).navigate(action)
            }
        }
    }
}
@HiltViewModel
class QuestionnaireViewModel @Inject constructor(
    private val talkBot: TalkBot,
    private val talkReader: TalkReader,
    private val sensor: Sensor,



    ) : ViewModel() {
    private fun measureTemperature() {
        viewModelScope.launch {
            val bodyTemp = sensor.receiveSensorData.first().bodyTemp
            val bodyTempValue = "%.1f".format(bodyTemp)
            //_temperature.emit(bodyTempValue)
            //talkBot.reportSensorData(temperature = bodyTempValue, "", "")

        }
    }
    }