package com.iitp.signage.dialog

import android.app.Dialog
import android.graphics.Point
import android.hardware.display.DisplayManager
import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.iitp.signage.R
import com.iitp.signage.databinding.FragmentSymptomsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SymptomsFragment : DialogFragment() {

    private val args by navArgs<SymptomsFragmentArgs>()

    private var _binding: FragmentSymptomsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSymptomsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            text = args.text
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        isCancelable = false
        return Dialog(requireContext(), R.style.Dialog)
    }

    override fun onResume() {
        super.onResume()

        val displayManager =
            ContextCompat.getSystemService(requireContext(), DisplayManager::class.java)
        val defaultDisplay = displayManager?.getDisplay(Display.DEFAULT_DISPLAY)
        val size = Point()
        defaultDisplay?.getSize(size)

        val params: ViewGroup.LayoutParams? = dialog?.window?.attributes
        val deviceWidth = size.x
        params?.width = (deviceWidth * 0.8).toInt()
        dialog?.window?.attributes = params as WindowManager.LayoutParams
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}