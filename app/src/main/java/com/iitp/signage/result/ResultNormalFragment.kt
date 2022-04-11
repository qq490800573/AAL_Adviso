package com.iitp.signage.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.iitp.signage.MainViewModel
import com.iitp.signage.Step
import com.iitp.signage.databinding.ResultNormalFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultNormalFragment : Fragment() {

    private var _binding: ResultNormalFragmentBinding? = null
    private val binding get() = _binding!!

    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ResultNormalFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setStepToResultNormal()
    }

    private fun setStepToResultNormal() {
        mainViewModel.setStep(Step.RESULT_NORMAL)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}