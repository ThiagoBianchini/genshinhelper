package com.example.genshinhelper.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.genshinhelper.R


class GenshinViewModel : ViewModel() {
    val travellerlist: List<Travellers> = listOf(

        Travellers(R.drawable.char_albedo, R.drawable.geo, "Albedo", "Geo Sword"),
        Travellers(R.drawable.char_aloy, R.drawable.cryo, "Aloy", "Cryo Bow"),
        Travellers(R.drawable.char_amber, R.drawable.pyro, "Amber", "Pyro Bow"),
        Travellers(R.drawable.char_ayaka, R.drawable.cryo, "Ayaka", "Cryo Sword"),
        Travellers(R.drawable.char_ayato, R.drawable.hydro, "Ayato", "Hydro Sword"),
        Travellers(R.drawable.char_barbara, R.drawable.hydro, "Barbara", "Hydro Catalyst"),
        Travellers(R.drawable.char_venti, R.drawable.anemo, "Venti", "Anemo Bow")
    )

    private val _listTravellers = MutableLiveData<List<Travellers>>(travellerlist)

    val listTravellers: LiveData<List<Travellers>> = _listTravellers

    fun setListaTravellers(value: List<Travellers>) {
        _listTravellers.postValue(value)
    }

}