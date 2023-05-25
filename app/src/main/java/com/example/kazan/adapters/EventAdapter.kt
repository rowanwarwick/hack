package com.example.kazan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kazan.interfaces.ListenerEvent
import com.example.kazan.R
import com.example.kazan.data.Event
import com.example.kazan.databinding.ItemEventBinding
import com.example.kazan.interfaces.OuterRecycleLocker

class EventAdapter(
    private val events: List<Event>,
    private val listener: ListenerEvent,
    private val outerRecycleLocker: OuterRecycleLocker? = null,
    private val isHorizontal: Boolean = false
) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    class EventViewHolder(
        view: View,
        private val listener: ListenerEvent,
        private val outerRecycleLocker: OuterRecycleLocker? = null,
        private val isHorizontal: Boolean
    ) : ViewHolder(view) {
        private val cardEvent = ItemEventBinding.bind(view)

        fun bind(event: Event) {
            cardEvent.apply {
                if (isHorizontal) eventImage.setImageResource(R.drawable.image)
                eventAddress.text = event.address
                eventDate.text = event.date
                eventName.text = event.name
                eventAddress.isSelected = true
                eventDate.isSelected = true
                eventName.isSelected = true
            }
            itemView.setOnClickListener {
                listener.onClick(event)
            }
            itemView.setOnTouchListener { _, _ ->
                outerRecycleLocker?.setRecyclerLocker(false)
                false
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
        if (!isHorizontal) view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        return EventViewHolder(view, listener, outerRecycleLocker, isHorizontal)
    }

    override fun getItemCount() = events.size

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(events[position])
    }
}