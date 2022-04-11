package com.iitp.signage

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import com.iitp.signage.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (!isGranted) finish()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
        }
        setContentView(binding.root)
        fullScreen(binding.root)
        setUpBackButton()
        checkAudioPermission()
    }

    private fun setUpBackButton() {
        repeatOnStarted(viewModel.backToStartEvent) {
            backToStart()
        }
    }

    private fun checkAudioPermission() {
        val recordAudioPermission = Manifest.permission.RECORD_AUDIO
        when {
            application.checkSelfPermission(recordAudioPermission) == PackageManager.PERMISSION_GRANTED -> Unit
            shouldShowRequestPermissionRationale(recordAudioPermission) -> Unit
            else -> requestPermissionLauncher.launch(recordAudioPermission)
        }
    }

    override fun onPause() {
        super.onPause()
        backToStart()
    }

    private fun backToStart() {
        val action = NavGraphDirections.globalActionToStart()
        findNavController(R.id.nav_host_fragment).navigate(action)
    }
}

