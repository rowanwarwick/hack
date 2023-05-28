package com.example.kazan.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kazan.R
import com.example.kazan.databinding.ItemMessageInputBinding

class SingleMessageAdaptor(val messages: MutableList<Triple<String, String, Boolean>>) :
    RecyclerView.Adapter<SingleMessageAdaptor.SingleViewHolder>() {

    class SingleViewHolder(view: View) : ViewHolder(view) {
        val historyMessage = ItemMessageInputBinding.bind(view)
        fun bind(messages: Triple<String, String, Boolean>) {
            historyMessage.message.text = messages.second
            val status = "${if (messages.third) "отправлено " else "прочитано "}${messages.first}"
            historyMessage.date.text = status
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (messages[position].third) {
            return 1
        }
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(if (viewType == 1) R.layout.item_message_input else R.layout.item_message_output, parent, false)
        return SingleViewHolder(view)
    }

    override fun getItemCount() = messages.size

    override fun onBindViewHolder(holder: SingleViewHolder, position: Int) {
        holder.bind(messages[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addMessage(message: Triple<String, String, Boolean>) {
        messages.add(message)
        notifyDataSetChanged()
    }

}