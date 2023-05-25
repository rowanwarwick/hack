package com.example.kazan.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kazan.fragments.MainEventFragment
import com.example.kazan.fragments.MainListFragment
import com.example.kazan.fragments.MainMenuFragment
import com.example.kazan.interfaces.OuterRecycleLocker

class MenuPagerAdapter(fragment: FragmentActivity, private val outerRecycleLocker: OuterRecycleLocker): FragmentStateAdapter(fragment) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MainMenuFragment(outerRecycleLocker)
            1 -> MainEventFragment()
            else -> MainListFragment()
        }
    }
}