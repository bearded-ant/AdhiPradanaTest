package com.example.adhipradanatest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.adhipradanatest.R
import com.example.adhipradanatest.databinding.FragmentSigninBinding

class SignInFragment : Fragment() {
    companion object {
        fun newInstance(): SignInFragment = SignInFragment()
    }

    private var _binding: FragmentSigninBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSigninBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        binding.frSignInLogInBtn.setOnClickListener {
            navController.navigate(R.id.action_signInFr_to_welcomeBackFr)
        }
        binding.frSignInWithGoogleBtn.setOnClickListener {
            navController.navigate(R.id.action_signInFr_to_profileFr)
        }
        binding.frSignInWithAppleBtn.setOnClickListener {
            navController.navigate(R.id.action_signInFr_to_profileFr)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}