package com.example.genshinhelper.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.R
import com.example.genshinhelper.model.Characters

class AdapChar(private val context: Context, private val characters: MutableList<Characters>): RecyclerView.Adapter<AdapChar.CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val CharInList = LayoutInflater.from(context).inflate(R.layout.character_list, parent, false)
        val holder = CharactersViewHolder(CharInList)
        return holder
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.avatar.setImageResource(characters[position].avatar)
        holder.element.setImageResource(characters[position].element)
        holder.name.text(characters[position].name)
        holder.description.text(characters[position].desc)


    }

    override fun getItemCount(): Int = characters.size


    inner class CharactersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val avatar = itemView.findViewById<ImageView>(R.id.char_avatar)
        val element = itemView.findViewById<ImageView>(R.id.char_element)
        val name = itemView.findViewById<TextView>(R.id.char_name)
        val description = itemView.findViewById<TextView>(R.id.char_desc)


    }


}



