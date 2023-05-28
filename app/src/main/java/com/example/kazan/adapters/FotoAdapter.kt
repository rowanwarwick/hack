package com.example.kazan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kazan.R
import com.example.kazan.databinding.ItemFotoBinding

class FotoAdapter(private val list: List<Int>) :RecyclerView.Adapter<FotoAdapter.FotoViewHolder>() {

    class FotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val picture = ItemFotoBinding.bind(view)
        fun bind(man: Int) {
            picture.foto.setImageResource(man)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_foto, parent, false)
        return FotoViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: FotoViewHolder, position: Int) {
        holder.bind(list[position])
    }
}