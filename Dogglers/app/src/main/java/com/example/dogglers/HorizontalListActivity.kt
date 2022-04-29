package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.databinding.ActivityHorizontalListBinding

class HorizontalListActivity: AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}