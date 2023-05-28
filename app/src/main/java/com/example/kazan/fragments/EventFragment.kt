package com.example.kazan.fragments

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.FotoAdapter
import com.example.kazan.data.Event
import com.example.kazan.databinding.FragmentEventBinding

class EventFragment : Fragment() {

    lateinit var binding: FragmentEventBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEventBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val event = arguments?.getSerializable("event") as Event?
        if (event != null) {
            binding.title.text = event.name
            binding.name.text = event.name
            binding.name.isSelected = true
            binding.eventAddress.text = event.address
            binding.eventAddress.isSelected = true
            binding.eventDate.text = event.date
            binding.eventDate.isSelected = true
            binding.infoEvent.text = event.about
            binding.website.text = event.webAddress
            binding.pagerSpeakers.adapter = FotoAdapter(event.speakers)
            binding.signUp.isSelected = event.isFavorite
        }
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }
}