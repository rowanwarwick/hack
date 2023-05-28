package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.adapters.EventAdapter
import com.example.kazan.adapters.MessageAdapter
import com.example.kazan.data.Chat
import com.example.kazan.databinding.FragmentMessageBinding
import com.example.kazan.hardcode.chatList
import com.example.kazan.hardcode.eventList
import com.example.kazan.interfaces.ListenerChat

class MessageFragment : Fragment() {

    lateinit var binding: FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as MainActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        (requireActivity() as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.mainFragment)
        }
        setHasOptionsMenu(true)
        binding.recycler.adapter = MessageAdapter(chatList, object : ListenerChat {
            override fun onClick(chat: Chat) {
                val bundle = Bundle()
                bundle.putSerializable("chat", chat)
                (activity as MainActivity).navController.navigate(R.id.chatFragment, bundle)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.ok, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.close -> {
                (activity as MainActivity).navController.navigate(R.id.mainFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}