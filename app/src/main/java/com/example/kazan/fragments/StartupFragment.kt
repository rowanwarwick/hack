package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.FotoAdapter
import com.example.kazan.data.Event
import com.example.kazan.data.Startup
import com.example.kazan.databinding.FragmentStartupBinding

class StartupFragment : Fragment() {
    lateinit var binding: FragmentStartupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val event = arguments?.getSerializable("startup") as Startup?
        if (event != null) {
            binding.name.text = event.name
        }
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
        binding.pagerSpeakers.adapter = FotoAdapter(List(6) {"foto"})
    }
}