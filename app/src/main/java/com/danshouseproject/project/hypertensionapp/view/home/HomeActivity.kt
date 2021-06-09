package com.danshouseproject.project.hypertensionapp.view.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.danshouseproject.project.hypertensionapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.elevation = 0f
    }

}