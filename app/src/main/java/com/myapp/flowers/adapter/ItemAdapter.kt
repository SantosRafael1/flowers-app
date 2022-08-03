package com.myapp.flowers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapp.flowers.R
import com.myapp.flowers.model.Flowers

class ItemAdapter (val context: Context, val dataset: List<Flowers>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

        class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
            val textV= view.findViewById<TextView>(R.id.tv)
            var img = view.findViewById<ImageView>(R.id.image_view)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textV.text = context.resources.getString(item.stringResourceId)
        holder.img.setImageResource(item.imgResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}