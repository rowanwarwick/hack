package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kazan.MainActivity
import com.example.kazan.data.Man
import com.example.kazan.databinding.FragmentSpecialistBinding

class SpecialistFragment : Fragment() {

    lateinit var binding: FragmentSpecialistBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSpecialistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val man = arguments?.getSerializable("man") as Man?
        if (man != null) {
            binding.title.text = man.name
            binding.name.text = man.name
            binding.speciality.text = "speciality"
            binding.info.text = "information"
        }
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
        binding.resume.setOnClickListener {
            Toast.makeText(requireContext(), "Загрузка резюме ${man?.name ?: ""} завершена", Toast.LENGTH_SHORT).show()
        }
        binding.portfolio.setOnClickListener {
            Toast.makeText(requireContext(), "Загрузка портфолио ${man?.name ?: ""} завершена", Toast.LENGTH_SHORT).show()
        }
    }

}