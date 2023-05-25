package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.kazan.callback.BackCallback
import com.example.kazan.MainActivity
import com.example.kazan.interfaces.OuterRecycleLocker
import com.example.kazan.R
import com.example.kazan.adapters.MenuPagerAdapter
import com.example.kazan.databinding.FragmentMainBinding
import com.example.kazan.shared_preferences.SharedPrefs
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment(),OuterRecycleLocker {

    lateinit var binding: FragmentMainBinding
    private val backCallback: BackCallback by lazy { BackCallback(requireActivity()) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = "${
            SharedPrefs.getValue(
                requireContext(),
                "name"
            )
        } ${SharedPrefs.getValue(requireContext(), "secName")}"
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener {
            (requireActivity() as MainActivity).binding.main.openDrawer(GravityCompat.START)
        }
        setTabs()
        setTitle(user)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backCallback)
        (requireActivity() as MainActivity).binding.user.text = user
    }

    private fun setTitle(user: String) {
        val nameTabs = arrayListOf(
            "Привет $user", "События",
            if (SharedPrefs.getValue(
                    requireContext(),
                    "role"
                ) == "Стартапер"
            ) "Люди" else "Стартапы"
        )
        binding.toolbar.title = nameTabs[0]
        binding.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val int = tab?.position
                binding.toolbar.title = nameTabs[int ?: 0]
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun setTabs() {
        binding.viewPager.adapter = MenuPagerAdapter(requireActivity(), this)
        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.setIcon(R.drawable.home)
                1 -> tab.setIcon(R.drawable.event)
                2 -> tab.setIcon(R.drawable.list)
            }
        }.attach()
    }

    override fun setRecyclerLocker(condition: Boolean) {
        binding.viewPager.isUserInputEnabled = condition
    }
}