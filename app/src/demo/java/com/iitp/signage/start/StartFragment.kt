package com.iitp.signage.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.iitp.saltlux_talkbot.TalkBot
import com.iitp.signage.*
import com.iitp.signage.databinding.StartFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartFragment : Fragment() {

    private var _binding: StartFragmentBinding? = null
    private val binding get() = _binding!!

    private val startViewModel by viewModels<StartViewModel>()
    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = StartFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            lifecycleOwner = viewLifecycleOwner
            viewModel = startViewModel
        }
        setStepToStart()
        setUpButtonStart()
        setUpNetworkErrorToast()
    }

    private fun setStepToStart() {
        mainViewModel.setStep(Step.START)
    }

    private fun setUpButtonStart() {
        repeatOnStarted(startViewModel.nextStepEvent) { navigateToQuestionnaire(it) }
    }

    private fun navigateToQuestionnaire(autoAnswerMode: TalkBot.AutoAnswerMode) {
        val action = StartFragmentDirections
            .actionStartFragmentToQuestionnaireFragment(autoAnswerMode)
        findNavController().navigate(action)
    }

    private fun setUpNetworkErrorToast() {
        repeatOnStarted(startViewModel.networkErrorEvent) { showNetworkErrorToast() }
    }

    private fun showNetworkErrorToast() = toast(resId = R.string.network_error)

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}