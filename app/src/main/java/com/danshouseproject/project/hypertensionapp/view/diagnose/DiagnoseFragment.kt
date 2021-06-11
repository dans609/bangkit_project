package com.danshouseproject.project.hypertensionapp.view.diagnose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danshouseproject.project.hypertensionapp.R
import com.danshouseproject.project.hypertensionapp.databinding.FragmentDiagnoseBinding
import com.danshouseproject.project.hypertensionapp.view.home.HomeActivity

class DiagnoseFragment : Fragment() {

    private var _binding: FragmentDiagnoseBinding? = null
    private val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as HomeActivity).supportActionBar?.hide()
        _binding = FragmentDiagnoseBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}