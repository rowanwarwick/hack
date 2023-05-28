package com.example.kazan

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kazan.databinding.ActivityMainBinding
import com.example.kazan.interfaces.DrawerLocker
import com.example.kazan.shared_preferences.SharedPrefs

class MainActivity : AppCompatActivity(), DrawerLocker {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestLocalPermission()
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
        binding.profileExit.setOnClickListener {
            finish()
        }
        binding.study.setOnClickListener {
            binding.main.closeDrawer(GravityCompat.START)
            navController.navigate(R.id.studyFragment)
        }
        binding.support.setOnClickListener {
            binding.main.closeDrawer(GravityCompat.START)
            navController.navigate(R.id.supportFragment)
        }
        binding.user.text = SharedPrefs.getValue(this, "name")
    }

    override fun setDrawerLocker(condition: Boolean) {
        if (condition) {
            binding.main.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        } else {
            binding.main.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        }
    }

    fun requestLocalPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ), 0
            )
            return
        }
    }
}