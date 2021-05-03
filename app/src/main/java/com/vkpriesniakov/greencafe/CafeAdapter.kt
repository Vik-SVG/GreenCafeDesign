package com.vkpriesniakov.greencafe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vkpriesniakov.greencafe.databinding.ItemCafeBinding

class CafeAdapter : RecyclerView.Adapter<CafeAdapter.CafeItemsViewHolder>() {

    private var allDishes = mutableListOf<Dishes>()

    internal fun setDishes(dishes: List<Dishes>) {
        this.allDishes = dishes.toMutableList()
        notifyDataSetChanged()
    }

    inner class CafeItemsViewHolder(private var bdnView: ItemCafeBinding) :
        RecyclerView.ViewHolder(bdnView.root) {
        fun bind(position: Int) {

            bdnView.itemImage.setImageDrawable(allDishes[position].image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CafeItemsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val bdn = ItemCafeBinding.inflate(inflater, parent, false)
        return CafeItemsViewHolder(bdn)
    }

    override fun onBindViewHolder(holder: CafeItemsViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = allDishes.size
}