package com.iitp.signagekiosk.guide

import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.databinding.DialogGuideBinding
import com.iitp.signagekiosk.util.autoCleared
import com.iitp.signagekiosk.util.fullScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GuideDialog : DialogFragment(R.layout.dialog_guide) {

    private var binding by autoCleared<DialogGuideBinding>()
    private val guideViewModel by viewModels<GuideViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DialogGuideBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = guideViewModel
        }
        fullScreen(binding.root)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(requireContext(), R.style.Dialog)
    }

}