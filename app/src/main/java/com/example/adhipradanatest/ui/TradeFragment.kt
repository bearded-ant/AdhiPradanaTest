package com.example.adhipradanatest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adhipradanatest.R
import com.example.adhipradanatest.data.SharedViewModel
import com.example.adhipradanatest.databinding.FragmentTradeBinding
import com.squareup.picasso.Picasso

class TradeFragment : Fragment() {
    companion object {
        fun newInstance(): TradeFragment = TradeFragment()
    }

    private val viewModel: SharedViewModel by lazy {
        ViewModelProvider(requireActivity())[SharedViewModel::class.java]
    }

    private var _binding: FragmentTradeBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTradeBinding.inflate(layoutInflater)
//todo revers layout? wtf?
        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)

        val recyclerLastDeal = binding.frTradeLatestRecycler
        recyclerLastDeal.layoutManager = layoutManager

        viewModel.refreshLatestDeal()
        viewModel.latestDealLiveData.observe(viewLifecycleOwner) {
            recyclerLastDeal.adapter = RecyclerLatestDealAdapter( it!!.latest)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomNavigation.itemIconTintList = null
        binding.bottomNavigation.selectedItemId = R.id.bottom_menu_page_home

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_menu_page_home -> findNavController().navigate(R.id.action_tradeFr_to_profileFr)
            }
            false
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}