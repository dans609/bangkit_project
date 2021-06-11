package com.danshouseproject.project.hypertensionapp.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.danshouseproject.project.hypertensionapp.R
import com.danshouseproject.project.hypertensionapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as HomeActivity).supportActionBar?.show()
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.let {
            it.containerDiagnosePage.setOnClickListener(navigationOnClick(R.id.action_homeFragment_to_diagnoseFragment))
            it.containerAboutPage.setOnClickListener(navigationOnClick(R.id.action_homeFragment_to_aboutFragment))
        }

    }

    private fun navigationOnClick(id: Int): View.OnClickListener =
        Navigation.createNavigateOnClickListener(id)

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}