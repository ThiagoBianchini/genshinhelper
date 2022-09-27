package com.example.genshinhelper

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.genshinhelper.model.Characters

class GenshinViewModel: ViewModel() {

    val charlist: List<Characters> = listOf(
        Characters(R.id.char_avatar, R.id.char_element, "@string/albedo", "@string/geo_sword")

    )



}