package com.example.genshinhelper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.databinding.TravellersListBinding
import com.example.genshinhelper.model.Travellers



class AdapTrav : ListAdapter<
        Travellers,
        AdapTrav.GenshinViewHolder
        >(AdapTravDiffCallBack()) {

    class GenshinViewHolder private constructor(
        val binding: TravellersListBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Travellers, position: Int) {
            binding.apply {
                travAvatar.setImageResource(item.avatar)
                travElement.setImageResource(item.element)
                travName.text = item.name
                travDesc.text = item.desc
            }

        }

        companion object {
            fun from(
                parent: ViewGroup
            ): GenshinViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = TravellersListBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
                return GenshinViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenshinViewHolder {
        return GenshinViewHolder.from(parent)
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


//
//class AdapTrav(private val context: Context, private val characters: MutableList<Characters>): RecyclerView.Adapter<AdapTrav.CharactersViewHolder>() {
//
//    class ViewHolder private constructor()
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
//        val CharInList = LayoutInflater.from(context).inflate(R.layout.character_list, parent, false)
//        val holder = CharactersViewHolder(CharInList)
//        return holder
//    }
//
//    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
//        holder.avatar.setImageResource(characters[position].avatar)
//        holder.element.setImageResource(characters[position].element)
//        holder.name.text(characters[position].name)
//        holder.description.text(characters[position].desc)
//
//
//    }
//
//    override fun getItemCount(): Int = characters.size
//
//
//    inner class CharactersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//        val avatar = itemView.findViewById<ImageView>(R.id.char_avatar)
//        val element = itemView.findViewById<ImageView>(R.id.char_element)
//        val name = itemView.findViewById<TextView>(R.id.char_name)
//        val description = itemView.findViewById<TextView>(R.id.char_desc)
//
//
//    }
//
//
//}



