package com.example.adhipradanatest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.adhipradanatest.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    companion object {
        fun newInstance(): ProfileFragment = ProfileFragment()
    }

    private var _binding: FragmentProfileBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomNavigation.itemIconTintList = null
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}