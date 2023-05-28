package com.example.kazan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kazan.R
import com.example.kazan.data.Chat
import com.example.kazan.databinding.ItemChatBinding
import com.example.kazan.interfaces.ListenerChat

class MessageAdapter(val chats: List<Chat>, val listener: ListenerChat): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(val view: View, val listener: ListenerChat): ViewHolder(view) {
        val chatWindow = ItemChatBinding.bind(view)
        fun bind(chat: Chat) {
            chatWindow.message.text = chat.message.last().second
            chatWindow.name.text = chat.name
            chatWindow.time.text = chat.message.last().first
            chatWindow.foto
            itemView.setOnClickListener {
                listener.onClick(chat)
            }
            chatWindow.newMessage.visibility = if (chat.newMessage) View.VISIBLE else View.INVISIBLE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return MessageViewHolder(view, listener)
    }

    override fun getItemCount() = chats.size

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(chats[position])
    }
}