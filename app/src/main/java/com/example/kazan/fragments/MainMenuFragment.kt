package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kazan.adapters.EventAdapter
import com.example.kazan.adapters.ManAdapter
import com.example.kazan.data.Event
import com.example.kazan.data.Man
import com.example.kazan.databinding.FragmentMainMenuBinding
import com.example.kazan.hardcode.eventList
import com.example.kazan.hardcode.manList
import com.example.kazan.interfaces.ListenerEvent
import com.example.kazan.interfaces.ListenerMan
import com.example.kazan.interfaces.OuterRecycleLocker
import com.example.kazan.shared_preferences.SharedPrefs

class MainMenuFragment(private val outerRecycleLocker: OuterRecycleLocker) : Fragment() {

    lateinit var binding: FragmentMainMenuBinding
    lateinit var adapterEvents: EventAdapter
    lateinit var recycleStartup: EventAdapter
    lateinit var adapterInvestor: ManAdapter
    lateinit var adapterSpecialist: ManAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterEvents = EventAdapter(eventList, object : ListenerEvent {
            override fun onClick(event: Event) {
                Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            }
        }, outerRecycleLocker, true)
        binding.pagerEvent.apply {
            adapter = adapterEvents
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 2
            getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER
        }
        view.setOnTouchListener { _, _ ->
            outerRecycleLocker.setRecyclerLocker(true)
            false
        }

        recycleStartup = EventAdapter(eventList, object : ListenerEvent {
            override fun onClick(event: Event) {
                Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            }
        }, outerRecycleLocker)
        binding.recyclerStartup.adapter = recycleStartup

        adapterInvestor = ManAdapter(manList, object : ListenerMan {
            override fun onClick(man: Man) {
                Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            }
        }, outerRecycleLocker, true)
        binding.pagerInvestors.apply {
            adapter = adapterInvestor
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 2
            getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER
        }
        view.setOnTouchListener { _, _ ->
            outerRecycleLocker.setRecyclerLocker(true)
            false
        }

        adapterSpecialist = ManAdapter(manList, object : ListenerMan {
            override fun onClick(man: Man) {
                Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            }
        }, outerRecycleLocker, true)
        binding.pagerSpecialist.apply {
            adapter = adapterSpecialist
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 2
            getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER
        }
        view.setOnTouchListener { _, _ ->
            outerRecycleLocker.setRecyclerLocker(true)
            false
        }

        if (SharedPrefs.getValue(requireContext(),"role") == "Стартапер") binding.forInvestor.visibility = View.GONE
        else binding.forStartap.visibility = View.GONE

    }
}