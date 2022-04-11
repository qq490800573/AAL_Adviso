package com.iitp.signagekiosk.questionnaire

import android.os.Bundle
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.databinding.FragmentQuestionnaireBinding
import com.iitp.signagekiosk.util.autoCleared
import com.iitp.signagekiosk.util.repeatOnStarted
import com.iitp.signagekiosk.util.voiceanimation.VoiceView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuestionnaireFragment : Fragment(R.layout.fragment_questionnaire) {

    private var binding by autoCleared<FragmentQuestionnaireBinding>()
    private val questionnaireViewModel by viewModels<QuestionnaireViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentQuestionnaireBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = questionnaireViewModel
        }

        repeatOnStarted(questionnaireViewModel.navigateToIntroEvent) {
            navigateToIntro()
        }
        repeatOnStarted(questionnaireViewModel.showEmergencyDialogEvent) {
            showEmergencyDialog(text = it)
        }
        repeatOnStarted(questionnaireViewModel.dismissEmergencyDialogEvent) {
            dismissEmergencyDialog()
        }
    }

    private fun navigateToIntro() {
        val action = QuestionnaireFragmentDirections.actionGlobalIntroFragment()
        findNavController().navigate(action)
    }

    private fun showEmergencyDialog(text: String) {
        val action = QuestionnaireFragmentDirections
            .actionQuestionnaireFragmentToEmergencyDialog(text = text)
        findNavController().navigate(action)
    }

    private fun dismissEmergencyDialog() {
        findNavController().popBackStack()
    }

}

@BindingAdapter("volume")
fun VoiceView.setVolume(volume: Int) {
    this.currentRadius = (volume.toFloat() * 0.9f)
}