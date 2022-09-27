package com.example.genshinhelper.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.R
import com.example.genshinhelper.databinding.CharacterListBinding
import com.example.genshinhelper.model.Characters



class AdapChar : ListAdapter<
        Characters,
        AdapChar.ViewHolder
        >(AdapCharDiffCallBack()) {

    class ViewHolder private constructor(
        val binding: CharacterListBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Characters, position: Int) {
            binding.apply {
                charAvatar.setImageResource(item.avatar)
                charElement.setImageResource(item.element)
                charName.text = item.name
                charDesc.text = item.desc
            }

        }

        companion object {
            fun from(
                parent: ViewGroup
            ): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CharacterListBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, position)
    }
}


class AdapCharDiffCallBack : DiffUtil.ItemCallback<Characters>() {
    override fun areItemsTheSame(oldItem: Characters, newItem: Characters): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Characters, newItem: Characters): Boolean {
        return oldItem == newItem
    }

}


//
//class AdapChar(private val context: Context, private val characters: MutableList<Characters>): RecyclerView.Adapter<AdapChar.CharactersViewHolder>() {
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



