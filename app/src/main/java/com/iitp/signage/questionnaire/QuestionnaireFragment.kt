package com.iitp.signage.questionnaire

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.postDelayed
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.iitp.saltlux_talkbot.Talk
import com.iitp.signage.*
import com.iitp.signage.databinding.QuestionnaireFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class QuestionnaireFragment : Fragment() {

    private var _binding: QuestionnaireFragmentBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var talkAdapter: TalkAdapter

    private val questionnaireViewModel by viewModels<QuestionnaireViewModel>()
    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = QuestionnaireFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            lifecycleOwner = viewLifecycleOwner
            viewModel = questionnaireViewModel
            talkRecyclerAdapter = talkAdapter
        }
        setStepToQuestionnaire()
        setUpWaveView()
        setUpDialogs()
        setUpNavigation()
    }

    private fun setStepToQuestionnaire() {
        mainViewModel.setStep(Step.QUESTIONNAIRE)
    }

    private fun setUpWaveView() {
        binding.voiceWave.apply {
            postDelayed(100) {
                initialize(DisplayMetrics().apply {
                    widthPixels = width
                    heightPixels = height
                })
            }
        }
    }

    private fun setUpDialogs() {
        repeatOnStarted(questionnaireViewModel.emergencyDialogEvent) {
            showSymptomsDialog(message = it.message)
        }
    }

    private fun showSymptomsDialog(message: String) {
        val action = QuestionnaireFragmentDirections
            .actionQuestionnaireFragmentToSymptomsFragment(text = message)
        findNavController().navigate(action)
    }

    private fun setUpNavigation() {
        repeatOnStarted(questionnaireViewModel.navigateToResultAbnormalEvent) {
            navigateToResultAbnormal(it)
        }
        repeatOnStarted(questionnaireViewModel.navigateToResultNormalEvent) {
            navigateToResultNormal()
        }
    }

    private fun navigateToResultAbnormal(talk: Talk) {
        with(findNavController()) {
            if (currentDestination?.id == R.id.symptomsFragment) {
                popBackStack()
            }
            val action = QuestionnaireFragmentDirections
                .actionQuestionnaireFragmentToResultAbnormalFragment(text = talk.message)
            navigate(action)
        }
    }

    private fun navigateToResultNormal() {
        val action = QuestionnaireFragmentDirections
            .actionQuestionnaireFragmentToResultNormalFragment()
        findNavController().navigate(action)
    }

    private fun backToStart() {
        val action = NavGraphDirections.globalActionToStart()
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}