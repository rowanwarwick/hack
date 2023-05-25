package com.example.kazan.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.EventAdapter
import com.example.kazan.data.Event
import com.example.kazan.databinding.FragmentMainEventBinding
import com.example.kazan.hardcode.eventList
import com.example.kazan.interfaces.ListenerEvent
import com.google.android.material.tabs.TabLayoutMediator

class MainEventFragment : Fragment() {

    lateinit var binding: FragmentMainEventBinding
    lateinit var adapterEvents: EventAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainEventBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterEvents = EventAdapter(eventList, object : ListenerEvent {
            override fun onClick(event: Event) {
                val bundle = Bundle()
                bundle.putSerializable("event", event)
                (activity as MainActivity).navController.navigate(R.id.eventFragment, bundle)
            }
        })
        binding.recyclerEvent.adapter = adapterEvents
    }
}