package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kazan.R
import com.example.kazan.databinding.FragmentMainEventBinding

class MainEventFragment : Fragment() {

    lateinit var binding: FragmentMainEventBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainEventBinding.inflate(inflater, container, false)
        return binding.root
    }
}