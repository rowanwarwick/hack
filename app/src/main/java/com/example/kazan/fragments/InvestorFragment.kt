package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.TagsAdapter
import com.example.kazan.data.Man
import com.example.kazan.databinding.FragmentInvestorBinding

class InvestorFragment : Fragment() {

    lateinit var binding: FragmentInvestorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInvestorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val man = arguments?.getSerializable("man") as Man?
        if (man != null) {
            binding.title.text = man.name
            binding.name.text = man.name
            binding.sumInvesting.text = "1000000"
            binding.info.text = "information"
            binding.investingStage.adapter = TagsAdapter(man.tagsPerson)
            binding.investingStorage.adapter = TagsAdapter(man.tagsPerson)
        }
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }

}