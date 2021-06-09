package com.danshouseproject.project.hypertensionapp.view.sign.up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danshouseproject.project.hypertensionapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.elevation = 0f


    }
}