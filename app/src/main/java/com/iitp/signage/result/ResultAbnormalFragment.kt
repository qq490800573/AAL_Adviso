package com.iitp.signage.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.iitp.signage.MainViewModel
import com.iitp.signage.Step
import com.iitp.signage.databinding.ResultAbnormalFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultAbnormalFragment : Fragment() {

    private val args by navArgs<ResultAbnormalFragmentArgs>()

    private var _binding: ResultAbnormalFragmentBinding? = null
    private val binding get() = _binding!!

    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ResultAbnormalFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text = args.text
        setStepToResultAbNormal()
    }

    private fun setStepToResultAbNormal() {
        mainViewModel.setStep(Step.RESULT_ABNORMAL)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}