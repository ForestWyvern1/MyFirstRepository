package com.example.firstproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = listOf(
            RecyclerData("123", 0),
            RecyclerData("dasd", 0),
            RecyclerData("123", 1),
            RecyclerData("12asda3", 0),
            RecyclerData("12asd3", 1),
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CombineRvAdapter(this, dataList)

    }
}