package com.iitp.signagekiosk.intro

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.iitp.signagekiosk.ConnectionStatus
import com.iitp.signagekiosk.DoNothing
import com.iitp.signagekiosk.MainViewModel
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.databinding.FragmentIntroBinding
import com.iitp.signagekiosk.util.autoCleared
import com.iitp.signagekiosk.util.repeatOnStarted
import com.iitp.signagekiosk.vital_sensor.Detection
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class IntroFragment : Fragment(R.layout.fragment_intro) {

    private var binding by autoCleared<FragmentIntroBinding>()
    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel.resetSensorState()
        binding = FragmentIntroBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        repeatOnStarted(mainViewModel.detection) {
           when (it) {
                Detection.NEW_USER -> {
                    if (mainViewModel.connectionStatus.value == ConnectionStatus.CONNECT) {
                       greetingAnim(endAction = ::navigateToGuide)
                    }
                }
                else -> DoNothing
            }
        }

        repeatOnStarted(mainViewModel.connectionStatus) {
            when (it) {
                ConnectionStatus.CONNECT -> mainViewModel.resetSensorState()
                else -> DoNothing
            }
        }
    }

    private fun greetingAnim(endAction: suspend () -> Unit) {
        val duration = 500L
        binding.greetings1.apply {
            alpha = 0f
            visibility = View.VISIBLE
            animate().setDuration(duration).alpha(1f)
        }

        binding.greetings2.apply {
            alpha = 0f
            visibility = View.VISIBLE
            animate().setDuration(duration).alpha(1f)
        }

        binding.logo.apply {
            animate()
                .setDuration(duration)
                .translationX(-530f)
                .withEndAction {
                    if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
                        viewLifecycleOwner.lifecycleScope.launch {
                            endAction()
                        }
                    }
                }
        }
    }

    private suspend fun navigateToGuide() {
        delay(2000)
        val action = IntroFragmentDirections.actionIntroFragmentToGuideFragment()
        findNavController().navigate(action)
    }
}