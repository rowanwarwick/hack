package com.example.kazan.fragments

import android.os.Bundle
import android.view.Gravity
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
import com.example.kazan.interfaces.MoveToTab
import com.example.kazan.shared_preferences.SharedPrefs
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment(),OuterRecycleLocker,MoveToTab {

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
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener {
            (requireActivity() as MainActivity).binding.main.openDrawer(GravityCompat.START)
        }
        val hello = "Привет ${SharedPrefs.getValue(requireContext(), "name")}"
        binding.textToolbar.text = hello
        binding.textToolbar.gravity = Gravity.START
        setTabs()
        setTitle(hello)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backCallback)
        (requireActivity() as MainActivity).binding.user.text = SharedPrefs.getValue(requireContext(), "name")
    }

    private fun setTitle(hello: String) {
        binding.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        binding.textToolbar.gravity = Gravity.START
                        binding.textToolbar.text = hello
                    }
                    1 -> {
                        binding.textToolbar.text = "События"
                        binding.textToolbar.gravity = Gravity.CENTER
                    }
                    2 -> {
                        binding.textToolbar.gravity = Gravity.CENTER
                        binding.textToolbar.text = if (SharedPrefs.getValue(requireContext(),"role") == "Стартапер") "Люди" else "Стартапы"
                    }
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun setTabs() {
        binding.viewPager.adapter = MenuPagerAdapter(requireActivity(), this, this)
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

    override fun moveToTab(tab: Int) {
        val requireTab = binding.tabs.getTabAt(tab)
        requireTab?.select()
    }
}