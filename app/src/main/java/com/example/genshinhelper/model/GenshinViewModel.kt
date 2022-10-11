package com.example.genshinhelper.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.genshinhelper.R


class GenshinViewModel : ViewModel() {
    val travellerlist: List<Travellers> = listOf(

        Travellers(R.drawable.char_albedo, R.drawable.geo, "Albedo", "Sword"),
        Travellers(R.drawable.char_aloy, R.drawable.cryo, "Aloy", "Bow"),
        Travellers(R.drawable.char_amber, R.drawable.pyro, "Amber", "Bow"),
        Travellers(R.drawable.char_ayaka, R.drawable.cryo, "Ayaka", "Sword"),
        Travellers(R.drawable.char_ayato, R.drawable.hydro, "Ayato", "Sword"),
        Travellers(R.drawable.char_barbara, R.drawable.hydro, "Barbara", "Catalyst"),
        Travellers(R.drawable.char_beidou, R.drawable.electro, "Beidou", "Claymore"),
        Travellers(R.drawable.char_bennett, R.drawable.pyro, "Bennett", "Sword"),
        Travellers(R.drawable.char_candance, R.drawable.hydro, "Candance", "Spear"),
        Travellers(R.drawable.char_chongyun, R.drawable.cryo, "Chongyun", "Claymore"),
        Travellers(R.drawable.char_collei, R.drawable.dendro, "Collei", "Bow"),
        Travellers(R.drawable.char_cyno, R.drawable.electro, "Cyno", "Spear"),
        Travellers(R.drawable.char_diluc, R.drawable.pyro, "Diluc", "Claymore"),
        Travellers(R.drawable.char_diona, R.drawable.cryo, "Diona", "Bow"),
        Travellers(R.drawable.char_dori, R.drawable.electro, "Dori", "Claymore"),
        Travellers(R.drawable.char_eula, R.drawable.cryo, "Eula", "Claymore"),
        Travellers(R.drawable.char_fischl, R.drawable.electro, "Fischl", "Bow"),
        Travellers(R.drawable.char_ganyu, R.drawable.cryo, "Ganyu", "Bow"),
        Travellers(R.drawable.char_gorou, R.drawable.geo, "Gorou", "Bow"),
        Travellers(R.drawable.char_heizou, R.drawable.anemo, "Heizou", "Catalyst"),
        Travellers(R.drawable.char_hu_tao, R.drawable.pyro, "Hu Tao", "Spear"),
        Travellers(R.drawable.char_itto, R.drawable.geo,"Itto" , "Claymore"),
        Travellers(R.drawable.char_jean, R.drawable.anemo, "Jean", "Sword"),
        Travellers(R.drawable.char_kaeya, R.drawable.cryo, "Kaeya", "Sword"),
        Travellers(R.drawable.char_kazuha, R.drawable.anemo, "Kazuha", "Sword"),
        Travellers(R.drawable.char_keqing, R.drawable.electro, "Keqing", "Sword"),
        Travellers(R.drawable.char_klee, R.drawable.pyro, "Klee", "Catalyst"),
        Travellers(R.drawable.char_kokomi, R.drawable.hydro, "Kokomi", "Catalyst"),
        Travellers(R.drawable.char_lisa, R.drawable.electro, "Lisa", "Catalyst"),
        Travellers(R.drawable.char_mona, R.drawable.hydro, "Mona", "Catalyst"),
        Travellers(R.drawable.char_ningguang, R.drawable.geo, "Ningguang", "Catalyst"),
        Travellers(R.drawable.char_noelle, R.drawable.geo, "Noelle", "Claymore"),
        Travellers(R.drawable.char_qiqi, R.drawable.cryo, "Qiqi", "Sword"),
        Travellers(R.drawable.char_raiden, R.drawable.electro, "Raiden", "Sword"),
        Travellers(R.drawable.char_razor, R.drawable.electro, "Razor", "Claymore"),
        Travellers(R.drawable.char_rosaria, R.drawable.cryo, "Rosaria", "Spear"),
        Travellers(R.drawable.char_sara, R.drawable.electro, "Sara", "Bow"),
        Travellers(R.drawable.char_sayu, R.drawable.dendro, "Sayu", "Claymore"),
        Travellers(R.drawable.char_shenhe, R.drawable.cryo, "Shenhe", "Spear"),
        Travellers(R.drawable.char_shinobu, R.drawable.electro, "Shinobu", "Sword"),
        Travellers(R.drawable.char_venti, R.drawable.anemo, "Venti", "Bow"),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),
        //Travellers(R.drawable., R.drawable., "", ""),

    )

    private val _listTravellers = MutableLiveData<List<Travellers>>(travellerlist)

    val listTravellers: LiveData<List<Travellers>> = _listTravellers

    fun setListaTravellers(value: List<Travellers>) {
        _listTravellers.postValue(value)
    }

}