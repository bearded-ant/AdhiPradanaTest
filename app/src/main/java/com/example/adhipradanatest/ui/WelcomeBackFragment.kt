package com.example.adhipradanatest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.adhipradanatest.R
import com.example.adhipradanatest.databinding.FragmentWelcomeBackBinding

class WelcomeBackFragment : Fragment() {
    companion object {
        fun newInstance(): WelcomeBackFragment = WelcomeBackFragment()
    }

    private var _binding: FragmentWelcomeBackBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeBackBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.frWelcomeBackLoginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeBackFr_to_profileFr)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}