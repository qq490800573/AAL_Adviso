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

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
                Detection.IDLE -> backToIntro()
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