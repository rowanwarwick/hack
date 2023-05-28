package com.example.kazan.fragments

import android.content.Context
import android.inputmethodservice.InputMethodService
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.SingleMessageAdaptor
import com.example.kazan.adapters.TagsAdapter
import com.example.kazan.data.Chat
import com.example.kazan.data.Man
import com.example.kazan.databinding.FragmentChatBinding
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

class ChatFragment : Fragment() {

    lateinit var binding: FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val chat = arguments?.getSerializable("chat") as Chat?
        if (chat != null) {
            binding.name.text = chat.name
            val adaptor = SingleMessageAdaptor(chat.message)
            binding.recycler.adapter = adaptor
            binding.send.setOnClickListener {
                if (!binding.inputMessage.text.isNullOrEmpty()) {
                    val dateFormat = SimpleDateFormat("HH:mm")
                    val date = dateFormat.format(Date())
                    adaptor.addMessage(Triple(date, binding.inputMessage.text.toString(), false))
                    binding.inputMessage.text?.clear()
                    val inputMethodManager = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    val windowToken = view.rootView?.windowToken
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
                    binding.recycler.scrollToPosition(adaptor.itemCount - 1)
                }
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