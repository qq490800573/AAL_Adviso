package com.iitp.signagekiosk.vital_sensor

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.databinding.ActivitySensorBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.stateIn

@AndroidEntryPoint
class SensorActivity : FragmentActivity() {
    private lateinit var binding: ActivitySensorBinding

    @Inject
    lateinit var sensor: Sensor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySensorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView5.setOnClickListener { finish() }
       /* binding.calibration.setOnClickListener {
            sensor.calibration()
        }*/

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.detection.collect {
                    // 사람 감지 상태
                    //binding.textView1214.text = "$it"
                    val text1 = "$it"
                    when {
                        //text1 == "NEW_USER" -> binding.textView1213.text = "too close"
                        text1 == "ACTIVE" -> binding.textView1214.text = "ACTIVE"
                        text1 == "NO_USER" -> binding.textView1214.text = "INACTIVE"
                        text1 == "IDLE" -> binding.textView1214.text = "INACTIVE"
                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.isMeasurable.collect {
                    // 측정 위치(65-115)
                    //binding.textView1211.text = "$it"

                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.isConnected.collect {
//                    Log.d("SENSOR DEMO", "$it")

                    val text1 = "$it"
                    when {
                        text1 == "true" -> binding.textView1213.text = "열결 됨"
                        text1 == "false" -> binding.textView1213.text = "연결 끊김"

                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.positionState.collect {
//                    Log.d("SENSOR Distance", "$it")
                    //// 측정 위치
                    val text1 = "$it"
                        when {
                            text1 == "CLOSE" -> binding.textView1211.text = "조금 뒤로 가세요"
                            text1 == "FIT" -> binding.textView1211.text = "측정 범위에 있음"
                            text1 == "FAR" -> binding.textView1211.text = "조금 앞으로 오세요"
                            //text1 == "GONE" -> binding.textView1213.text = "Please wait"
                        }
                    //}

                //binding.distance.text = "거리상태: $it"
                }
            }
        }

        val lineChart = binding.chart

        val xAxis: XAxis = lineChart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.textColor = Color.BLACK
        xAxis.enableGridDashedLine(8f, 24f, 0f)
        xAxis.mAxisMinimum = -6000f
        xAxis.mAxisMaximum = 16000f
        //xAxis.resetAxisMaximum()
        //xAxis.resetAxisMinimum()

        val yLAxis: YAxis = lineChart.axisLeft
        yLAxis.textColor = Color.BLACK

        val yRAxis: YAxis = lineChart.axisRight
        yRAxis.setDrawLabels(false)
        yRAxis.setDrawAxisLine(false)
        yRAxis.setDrawGridLines(false)

        val description = Description()
        description.text = " "

        lineChart.isDoubleTapToZoomEnabled = false
        lineChart.setDrawGridBackground(false)
        lineChart.description = description

        val lineDataSet = LineDataSet(mutableListOf(), "사람과 센세의 거리").apply {
            lineWidth = 2f
            circleRadius = 6f
            setCircleColor(Color.parseColor("#FFA1B4DC"))
            color = Color.parseColor("#FFA1B4DC")
            setDrawCircleHole(true)
            setDrawCircles(true)
            setDrawHorizontalHighlightIndicator(true)
            setDrawHighlightIndicators(true)
            setDrawValues(false)
            //setDraw
        }
        val lineData = LineData(lineDataSet)
        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.receiveSensorData.collect {
                    binding.textView1212.text = "${"%.1f".format(it.bodyTemp + 1)}"
                    /*var x = 6
                    var temp: Double = 0.0

                    while (x > 0) {
                        temp = it.bodyTemp.plus(temp)
                        binding.textView1212.text = "${"%.1f".format(temp)}"
                        x--
                        }
                    var temp1 = temp.div(6)
                    binding.textView1212.text = "${"%.1f".format(temp1)}"*/
                    // delay(500L)
                }
            }
        }
        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.receiveSensorData.collect {
                    binding.textView1213.text = "연결 됨"
                    var x = 40
                    while (x > 0) {
                        /*if(it.motion == 1){
                            binding.textView151.text = "00"
                            //binding.textView121.text = "${"%.1f".format(it.bodyTemp)}"
                            binding.textView16.text = "00"
                        }else{
                            binding.textView151.text = "${it.breath.toInt()}"
                            //binding.textView121.text = "${"%.1f".format(it.bodyTemp)}"
                            binding.textView16.text = "${it.heartRate.toInt()}"
                        }*/
                        binding.textView151.text = "${it.breath.toInt()}"
                        //binding.textView121.text = "${"%.1f".format(it.bodyTemp)}"
                        binding.textView16.text = "${it.heartRate.toInt()}"
                        //"체온: ${"%.1f".format(it.bodyTemp)}℃ | 호흡수: ${it.breath.toInt()}rpm | 심박수: ${it.heartRate.toInt()}rpm | motion: ${it.motion}"
                        with(it) {
                            lineDataSet.clear()
                            xRange.forEachIndexed { index, x ->
                                lineDataSet.addEntry(Entry(x.toFloat(), yValue[index].toFloat()))
                            }
                            lineData.clearValues()
                            lineData.addDataSet(lineDataSet)
                            lineChart.data = lineData
                            lineChart.invalidate()
                        }
                        x--
                    }
                }
            }
        }
    }
}