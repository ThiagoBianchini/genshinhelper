package com.example.genshinhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.adapter.AdapTrav
import com.example.genshinhelper.adapter.TravellerListener
import com.example.genshinhelper.model.Travellers

class TravellerSelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traveller_selection)
    }

}