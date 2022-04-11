package com.iitp.signagekiosk

import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.iitp.signagekiosk.databinding.DialogDisconnectionBinding
import com.iitp.signagekiosk.util.autoCleared
import com.iitp.signagekiosk.util.fullScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DisconnectionDialog : DialogFragment(R.layout.dialog_disconnection) {

    private val args by navArgs<DisconnectionDialogArgs>()
    private var binding by autoCleared<DialogDisconnectionBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DialogDisconnectionBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            connection = args.connection
        }
        fullScreen(binding.root)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return Dialog(requireContext(), R.style.Dialog)
    }

}