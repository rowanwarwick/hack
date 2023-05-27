package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.core.view.MenuProvider
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.EventAdapter
import com.example.kazan.adapters.ManAdapter
import com.example.kazan.adapters.StartupAdapter
import com.example.kazan.databinding.FragmentFavoriteBinding
import com.example.kazan.hardcode.eventList
import com.example.kazan.hardcode.manList
import com.example.kazan.hardcode.startupList
import com.example.kazan.shared_preferences.SharedPrefs

class FavoriteFragment : Fragment() {

    lateinit var binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener {
            (requireActivity() as MainActivity).binding.main.openDrawer(GravityCompat.START)
        }
        setHasOptionsMenu(true)
        binding.events.isChecked = true
        binding.list.text = if (SharedPrefs.getValue(requireContext(), "role") == "Стартапер") "Люди" else "Стартапы"
        binding.recycler.adapter =
            if (binding.events.isChecked) {
                EventAdapter(eventList)
            } else {
                if (SharedPrefs.getValue(requireContext(), "role") == "Стартапер") ManAdapter(
                    manList
                ) else StartupAdapter(startupList)
            }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.ok, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.close -> {
                (activity as MainActivity).navController.navigate(R.id.mainFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}