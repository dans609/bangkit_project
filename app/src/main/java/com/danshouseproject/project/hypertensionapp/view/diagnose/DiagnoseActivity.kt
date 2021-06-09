package com.danshouseproject.project.hypertensionapp.view.diagnose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danshouseproject.project.hypertensionapp.R
import com.danshouseproject.project.hypertensionapp.databinding.ActivityDiagnoseBinding

class DiagnoseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDiagnoseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiagnoseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.elevation = 0f


    }
}