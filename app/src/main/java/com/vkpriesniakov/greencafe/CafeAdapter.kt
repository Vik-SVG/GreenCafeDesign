package com.vkpriesniakov.greencafe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.marginLeft
import androidx.core.view.marginStart
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

            if (position % 2 == 1) {

            }
            bdnView.apply {
                itemImage.setImageDrawable(allDishes[position].image)
                itemDescription.text = allDishes[position].description
                itemPrice.text = allDishes[position].price
                itemSizes.text = allDishes[position].size
                itemTitle.text = allDishes[position].title
            }
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