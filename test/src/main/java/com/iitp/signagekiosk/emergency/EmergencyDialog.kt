package com.iitp.signagekiosk.emergency

import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.iitp.signagekiosk.R
import com.iitp.signagekiosk.databinding.DialogEmergencyBinding
import com.iitp.signagekiosk.util.autoCleared
import com.iitp.signagekiosk.util.fullScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EmergencyDialog : DialogFragment(R.layout.dialog_emergency) {

    private val args by navArgs<EmergencyDialogArgs>()

    private var binding by autoCleared<DialogEmergencyBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DialogEmergencyBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            text = args.text.trim()
        }
        fullScreen(binding.root)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(requireContext(), R.style.Dialog)
    }

}