package com.banklannister.expandablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.banklannister.expandablerecyclerview.adapter.MainAdapter
import com.banklannister.expandablerecyclerview.databinding.ActivityMainBinding
import com.banklannister.expandablerecyclerview.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvMain.adapter = MainAdapter(SampleData.collectios)
    }
}