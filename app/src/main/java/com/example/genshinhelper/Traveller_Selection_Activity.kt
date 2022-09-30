package com.example.genshinhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.adapter.AdapTrav
import com.example.genshinhelper.model.Travellers

class Traveller_Selection_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traveller_selection)

        val RV_chars = findViewById<RecyclerView>(R.id.RVTravellers)
        RV_chars.layoutManager = LinearLayoutManager(this)
        RV_chars.setHasFixedSize(true)

        val character_list: MutableList<Travellers> = mutableListOf()
        val charAdapter =  AdapTrav()
        charAdapter.submitList(character_list)
        RV_chars.adapter = charAdapter

        val Albedo = Travellers(
            R.drawable.char_albedo,
            R.drawable.geo,
            getString(R.string.albedo),
            getString(R.string.geo_sword)
        )
        character_list.add(Albedo)

        val Aloy = Travellers(
            R.drawable.char_aloy,
            R.drawable.cryo,
            "Aloy",
            "Cryo Bow"
        )
        character_list.add(Aloy)

        val Amber = Travellers(
            R.drawable.char_amber,
            R.drawable.pyro,
            "Amber",
            "Pyro Bow"
        )
        character_list.add(Amber)

        val Ayaka = Travellers(
            R.drawable.char_ayaka,
            R.drawable.cryo,
            "Ayaka",
            "Cryo Sword"
        )
        character_list.add(Ayaka)

        val Ayato = Travellers(
            R.drawable.char_ayato,
            R.drawable.hydro,
            "Ayato",
            "Hydro Sword"
        )
        character_list.add(Ayato)

        val Barbara = Travellers(
            R.drawable.char_barbara,
            R.drawable.hydro,
            "Barbara",
            "Hydro Catalyst"
        )
        character_list.add(Barbara)

        val Venti = Travellers(
            R.drawable.char_venti,
            R.drawable.anemo,
            "Venti",
            "Anemo Bow"
        )
        character_list.add(Venti)

    }
}