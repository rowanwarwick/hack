package com.example.kazan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kazan.R
import com.example.kazan.data.Startup
import com.example.kazan.databinding.ItemStartupBinding
import com.example.kazan.interfaces.ListenerStartup

class StartupAdapter (
    private val startup: List<Startup>,
    private val listener: ListenerStartup
) : RecyclerView.Adapter<StartupAdapter.StartupViewHolder>() {
    class StartupViewHolder(val view: View, val listener: ListenerStartup): ViewHolder(view) {
        private val cardStartup = ItemStartupBinding.bind(view)

        fun bind(startup: Startup) {
            cardStartup.apply {
                startupName.text = startup.name
                startupUser.text = startup.creator
                startupLink.text = startup.link
            }
            itemView.setOnClickListener {
                listener.onClick(startup)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartupViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_startup, parent, false)
        return StartupViewHolder(view, listener)
    }

    override fun getItemCount() = startup.size

    override fun onBindViewHolder(holder: StartupViewHolder, position: Int) {
        holder.bind(startup[position])
    }
}