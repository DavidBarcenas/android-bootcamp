package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}