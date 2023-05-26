package com.example.kazan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kazan.R
import com.example.kazan.data.Man
import com.example.kazan.databinding.ItemManBinding
import com.example.kazan.interfaces.ListenerMan
import com.example.kazan.interfaces.OuterRecycleLocker

class ManAdapter(
    private val man: List<Man>,
    private val listener: ListenerMan? = null,
    private val outerRecycleLocker: OuterRecycleLocker? = null,
    private val isHorizontal: Boolean = false
) :
    RecyclerView.Adapter<ManAdapter.ManViewHolder>() {

    class ManViewHolder(
        view: View,
        private val listener: ListenerMan? = null,
        private val outerRecycleLocker: OuterRecycleLocker? = null
    ) : RecyclerView.ViewHolder(view) {
        private val person = ItemManBinding.bind(view)

        fun bind(man: Man) {
            person.apply {
                name.text = man.name
                val adapter = TagsAdapter(man.tagsPerson, outerRecycleLocker)
                tags.adapter = adapter
            }

            itemView.setOnClickListener {
                listener?.onClick(man)
            }
            itemView.setOnTouchListener { _, _ ->
                outerRecycleLocker?.setRecyclerLocker(false)
                false
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_man, parent, false)
        if (!isHorizontal) view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return ManViewHolder(view, listener, outerRecycleLocker)
    }

    override fun getItemCount() = man.size

    override fun onBindViewHolder(holder: ManViewHolder, position: Int) {
        holder.bind(man[position])
    }
}