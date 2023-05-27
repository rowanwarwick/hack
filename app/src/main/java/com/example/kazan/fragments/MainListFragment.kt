package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.EventAdapter
import com.example.kazan.adapters.ManAdapter
import com.example.kazan.adapters.StartupAdapter
import com.example.kazan.data.Event
import com.example.kazan.data.Man
import com.example.kazan.data.Startup
import com.example.kazan.databinding.FragmentMainListBinding
import com.example.kazan.hardcode.eventList
import com.example.kazan.hardcode.manList
import com.example.kazan.hardcode.startupList
import com.example.kazan.interfaces.ListenerEvent
import com.example.kazan.interfaces.ListenerMan
import com.example.kazan.interfaces.ListenerStartup
import com.example.kazan.shared_preferences.SharedPrefs

class MainListFragment : Fragment() {

    lateinit var binding: FragmentMainListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (SharedPrefs.getValue(requireContext(), "role") == "Стартапер") {
            binding.investors.isChecked = true
            binding.recycler.adapter = ManAdapter(manList, object : ListenerMan {
                override fun onClick(man: Man) {
                    val bundle = Bundle()
                    bundle.putSerializable("man", man)
                    (activity as MainActivity).navController.navigate(
                        if (man.role != "Инвестор") R.id.specialistFragment else R.id.investorFragment,
                        bundle
                    )
                }
            })
        } else {
            binding.tabs.visibility = View.GONE
            binding.recycler.adapter = StartupAdapter(startupList, object : ListenerStartup {
                override fun onClick(startup: Startup) {
                    val bundle = Bundle()
                    bundle.putSerializable("startup", startup)
                    (activity as MainActivity).navController.navigate(R.id.startupFragment, bundle)
                }
            })
        }
    }
}