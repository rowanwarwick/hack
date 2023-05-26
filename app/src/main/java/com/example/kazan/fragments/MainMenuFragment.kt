package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kazan.adapters.EventAdapter
import com.example.kazan.adapters.ManAdapter
import com.example.kazan.databinding.FragmentMainMenuBinding
import com.example.kazan.hardcode.eventList
import com.example.kazan.hardcode.manList
import com.example.kazan.interfaces.MoveToTab
import com.example.kazan.interfaces.OuterRecycleLocker
import com.example.kazan.shared_preferences.SharedPrefs

class MainMenuFragment(private val outerRecycleLocker: OuterRecycleLocker, private val moveToTab: MoveToTab) : Fragment() {

    lateinit var binding: FragmentMainMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapterEvents = EventAdapter(listOf(eventList[0]))
        binding.pagerEvent.adapter = adapterEvents

        val recycleStartup = EventAdapter(eventList)
        binding.recyclerStartup.adapter = recycleStartup

        val adapterInvestor = ManAdapter(manList.subList(0, 3), outerRecycleLocker = outerRecycleLocker, isHorizontal = true)
        binding.pagerInvestors.apply {
            adapter = adapterInvestor
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 2
            getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER
        }

        val adapterSpecialist = ManAdapter(manList.subList(0, 3), outerRecycleLocker = outerRecycleLocker, isHorizontal = true)
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

        binding.allEvent.setOnClickListener {
            moveToTab.moveToTab(1)
        }

        binding.allStartup.setOnClickListener {
            moveToTab.moveToTab(2)
        }

        binding.allInvestor.setOnClickListener {
            moveToTab.moveToTab(2)
        }

        binding.allSpecialist.setOnClickListener {
            moveToTab.moveToTab(2)
        }

    }
}