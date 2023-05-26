package com.example.kazan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kazan.R
import com.example.kazan.databinding.ItemTagBinding
import com.example.kazan.interfaces.OuterRecycleLocker

class TagsAdapter(val tags: List<String>, val outerRecycleLocker: OuterRecycleLocker?) : RecyclerView.Adapter<TagsAdapter.TagsViewHolder>() {

    class TagsViewHolder(view: View, val outerRecycleLocker: OuterRecycleLocker?) : ViewHolder(view) {
        private val tag = ItemTagBinding.bind(view)

        fun bind(info: String) {
            tag.tag.text = info

            itemView.setOnTouchListener { _, _ ->
                outerRecycleLocker?.setRecyclerLocker(false)
                false
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tag, parent, false)
        return TagsViewHolder(view, outerRecycleLocker)
    }

    override fun getItemCount() = tags.size

    override fun onBindViewHolder(holder: TagsViewHolder, position: Int) {
        holder.bind(tags[position])
    }
}