package com.iitp.signagekiosk.vital_sensor

import android.annotation.SuppressLint
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
import com.iitp.signagekiosk.databinding.ActivitySensorBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SensorActivity : FragmentActivity() {
    private lateinit var binding: ActivitySensorBinding

    @Inject
    lateinit var sensor: Sensor

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySensorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exit.setOnClickListener { finish() }
        binding.calibration.setOnClickListener {
            sensor.calibration()
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.detection.collect {
                    binding.detected.apply {
                        text = "사람 감지: $it"
                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.isMeasurable.collect {
                    binding.measurable.apply {
                        text = "측정가능위치(65cm~95cm): $it"
                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.isConnected.collect {
//                    Log.d("SENSOR DEMO", "$it")
                    binding.text.apply {
                        text = "sensor.isConnected: $it"
                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.positionState.collect {
//                    Log.d("SENSOR Distance", "$it")
                    binding.distance.text = "거리상태: $it"
                }
            }
        }

        val lineChart = binding.chart

        val xAxis: XAxis = lineChart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.textColor = Color.BLACK
        xAxis.enableGridDashedLine(8f, 24f, 0f)

        val yLAxis: YAxis = lineChart.axisLeft
        yLAxis.textColor = Color.BLACK

        val yRAxis: YAxis = lineChart.axisRight
        yRAxis.setDrawLabels(false)
        yRAxis.setDrawAxisLine(false)
        yRAxis.setDrawGridLines(false)

        val description = Description()
        description.text = ""

        lineChart.isDoubleTapToZoomEnabled = false
        lineChart.setDrawGridBackground(false)
        lineChart.description = description

        val lineDataSet = LineDataSet(mutableListOf(), "속성명1").apply {
            lineWidth = 2f
            circleRadius = 6f
            setCircleColor(Color.parseColor("#FFA1B4DC"))
            color = Color.parseColor("#FFA1B4DC")
            setDrawCircleHole(true)
            setDrawCircles(true)
            setDrawHorizontalHighlightIndicator(false)
            setDrawHighlightIndicators(false)
            setDrawValues(false)
        }
        val lineData = LineData(lineDataSet)

        lifecycleScope.launch {
            repeatOnLifecycle(state = Lifecycle.State.STARTED) {
                sensor.receiveSensorData.collect {
                    binding.sensorData.text =
                        "체온: ${"%.1f".format(it.bodyTemp)}℃ | 호흡수: ${it.breath.toInt()}rpm | 심박수: ${it.heartRate.toInt()}rpm | motion: ${it.motion}"
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
                }
            }
        }
    }
}