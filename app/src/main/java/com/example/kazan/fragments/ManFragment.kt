package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.FotoAdapter
import com.example.kazan.data.Event
import com.example.kazan.data.Man
import com.example.kazan.databinding.FragmentManBinding

class ManFragment : Fragment() {

    lateinit var binding: FragmentManBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentManBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val man = arguments?.getSerializable("man") as Man?
        if (man != null) {
            if (man.role == "Специалист") {
                binding.name.text = man.name
                binding.field1.text = "Желаемая должность"
                binding.field2.text = "Опыт"
                binding.field3.text = "О себе"
                binding.field4.visibility = View.GONE
                binding.field4Text.visibility = View.GONE
            } else {
                binding.name.text = man.name
                binding.field1.text = "Интересующие направления"
                binding.field2.text = "Размер инвестиций"
                binding.field3.text = "Стадии инвестирования"
                binding.field4.text = "О себе"
            }
        }
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }
}