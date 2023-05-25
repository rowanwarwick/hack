package com.example.kazan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kazan.databinding.ActivityMainBinding
import com.example.kazan.interfaces.DrawerLocker

class MainActivity : AppCompatActivity(), DrawerLocker {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = Navigation.findNavController(this, R.id.nav_host_auth)
        binding.profileFavorite.setOnClickListener {
            binding.main.closeDrawer(GravityCompat.START)
            navController.navigate(R.id.favoriteFragment)
        }
        binding.profileHistory.setOnClickListener {
            binding.main.closeDrawer(GravityCompat.START)
            navController.navigate(R.id.historyFragment)
        }
        binding.profileMap.setOnClickListener {
            binding.main.closeDrawer(GravityCompat.START)
            navController.navigate(R.id.mapFragment)
        }
        binding.profileMessage.setOnClickListener {
            binding.main.closeDrawer(GravityCompat.START)
            navController.navigate(R.id.messageFragment)
        }
        binding.user.text
    }

    override fun setDrawerLocker(condition: Boolean) {
        if (condition) {
            binding.main.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        } else {
            binding.main.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        }
    }
}