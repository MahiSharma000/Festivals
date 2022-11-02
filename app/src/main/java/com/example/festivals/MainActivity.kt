package com.example.festivals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.festivals.adapters.FestivalAdapter
import com.example.festivals.dataSource.DataSource
import com.example.festivals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val festivals=DataSource().loadFestivals()
        val adapter=FestivalAdapter(
            this,
            festivals,
            R.layout.simple_row_layout
        )
        binding.festivalList.layoutManager= LinearLayoutManager(this)
        binding.festivalList.adapter=adapter

    }
}