package com.example.genshinhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.genshinhelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val TAG = "Genshin Custom Farm Guide"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.EntryButton.setOnClickListener {
            val entryIntent = Intent(this, TravellerSelectionActivity::class.java)
            startActivity(entryIntent)
        }
    }
}