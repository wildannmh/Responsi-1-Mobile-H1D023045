package com.example.responsi1mobileh1d023045

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi1mobileh1d023045.databinding.ActivityHalamanClubBinding

class HalamanClubActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHalamanClubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanClubBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}