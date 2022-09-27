package com.example.genshinhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.adapter.AdapChar
import com.example.genshinhelper.model.Characters

class Character_Selection_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_selection)

        val RV_chars = findViewById<RecyclerView>(R.id.RVChars)
        RV_chars.layoutManager = LinearLayoutManager(this)
        RV_chars.setHasFixedSize(true)

        val character_list: MutableList<Characters> = mutableListOf()
        val charAdapter =  AdapChar()
        charAdapter.submitList(character_list)
        RV_chars.adapter = charAdapter

        val Albedo = Characters(
            R.drawable.char_albedo,
            R.drawable.geo,
            getString(R.string.albedo),
            getString(R.string.geo_sword)
        )
        character_list.add(Albedo)

        val Aloy = Characters(
            R.drawable.char_aloy,
            R.drawable.cryo,
            "Aloy",
            "Cryo Bow"
        )
        character_list.add(Aloy)

        val Amber = Characters(
            R.drawable.char_amber,
            R.drawable.pyro,
            "Amber",
            "Pyro Bow"
        )
        character_list.add(Amber)

        val Ayaka = Characters(
            R.drawable.char_ayaka,
            R.drawable.cryo,
            "Ayaka",
            "Cryo Sword"
        )
        character_list.add(Ayaka)

        val Ayato = Characters(
            R.drawable.char_ayato,
            R.drawable.hydro,
            "Ayato",
            "Hydro Sword"
        )
        character_list.add(Ayato)

        val Barbara = Characters(
            R.drawable.char_barbara,
            R.drawable.hydro,
            "Barbara",
            "Hydro Catalyst"
        )

        val Venti = Characters(
            R.drawable.char_venti,
            R.drawable.anemo,
            "Venti",
            "Anemo Bow"
        )
        character_list.add(Venti)


    }
}