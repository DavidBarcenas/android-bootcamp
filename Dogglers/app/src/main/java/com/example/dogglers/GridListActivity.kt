package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.const.Layout
import com.example.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )
        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}