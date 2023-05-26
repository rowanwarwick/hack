package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kazan.interfaces.DrawerLocker
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.databinding.FragmentIntroBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class IntroFragment : Fragment() {

    lateinit var binding: FragmentIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIntroBinding.inflate(inflater, container, false)
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            (activity as MainActivity).navController.navigate(R.id.action_introFragment_to_logInFragment)
        }
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        (activity as DrawerLocker).setDrawerLocker(true)
    }

    override fun onStop() {
        super.onStop()
        (activity as DrawerLocker).setDrawerLocker(false)
    }
}