package com.example.genshinhelper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.databinding.TravellersListBinding
import com.example.genshinhelper.model.Travellers



class AdapTrav(val listener: TravellerListener) : ListAdapter<
        Travellers,
        AdapTrav.GenshinViewHolder
        >(AdapTravDiffCallBack()) {

    class GenshinViewHolder private constructor(
        val binding: TravellersListBinding,
        val listener: TravellerListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Travellers, position: Int) {
            binding.apply {
                travAvatar.setImageResource(item.avatar)
                travElement.setImageResource(item.element)
                travName.text = item.name
                travDesc.text = item.desc
                container.setOnClickListener { listener.onTravellerClick(position) }
            }

        }

        companion object {
            fun from(
                parent: ViewGroup, listener: TravellerListener
            ): GenshinViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = TravellersListBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
                return GenshinViewHolder(binding, listener)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenshinViewHolder {
        return GenshinViewHolder.from(parent, listener)
    }

    override fun onBindViewHolder(holder: GenshinViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, position)
    }
}

class AdapTravDiffCallBack : DiffUtil.ItemCallback<Travellers>() {
    override fun areItemsTheSame(oldItem: Travellers, newItem: Travellers): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Travellers, newItem: Travellers): Boolean {
        return oldItem == newItem
    }
}

interface  TravellerListener{
    fun onTravellerClick(position: Int)
}



