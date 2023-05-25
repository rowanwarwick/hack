package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kazan.databinding.FragmentMainListBinding

class MainListFragment : Fragment() {

    lateinit var binding: FragmentMainListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainListBinding.inflate(inflater, container, false)
        return binding.root
    }
}