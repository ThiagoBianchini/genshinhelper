package com.example.genshinhelper

import androidx.lifecycle.MutableLiveData

open class ViewModel: ViewModel() {
    val name = MutableLiveData<String>()
    val desc = MutableLiveData<String>()

}