package com.iitp.signagekiosk.loading

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.databinding.FragmentLoadingBinding
import com.iitp.signagekiosk.util.autoCleared
import com.iitp.signagekiosk.util.repeatOnStarted
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoadingFragment : Fragment(R.layout.fragment_loading) {

    private var binding by autoCleared<FragmentLoadingBinding>()
    private val loadingViewModel by viewModels<LoadingViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoadingBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = loadingViewModel
        }

        showGuideDialog()

        repeatOnStarted(loadingViewModel.guideCompleteEvent) {
            dismissGuideDialog()
        }

        repeatOnStarted(loadingViewModel.loadingCompleteEvent) {
            navigateToQuestionnaire()
        }
    }

    private fun showGuideDialog() {
        val action = LoadingFragmentDirections.actionGuideFragmentToGuideDialog()
        findNavController().navigate(action)
    }

    private fun dismissGuideDialog() {
        findNavController().popBackStack()
        binding.progressContent.visibility = View.VISIBLE
    }

    private fun navigateToQuestionnaire() {
        val action = LoadingFragmentDirections.actionGuideFragmentToQuestionnaireFragment()
        findNavController().navigate(action)
    }

}