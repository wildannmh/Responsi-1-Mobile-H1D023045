package com.example.responsi1mobileh1d023045

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi1mobileh1d023045.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()
        initListener()
    }

    private fun initLayout() {
        binding.layoutClub.let {
            it.imgIcon.setImageResource(R.drawable.ic_club)
            it.tvLayout.setText(R.string.club)
        }

        binding.layoutCoach.let {
            it.imgIcon.setImageResource(R.drawable.ic_coach)
            it.tvLayout.setText(R.string.coach)
        }

        binding.layoutTeam.let {
            it.imgIcon.setImageResource(R.drawable.ic_team)
            it.tvLayout.setText(R.string.team)
        }
    }

    private fun initListener() {
        binding.layoutClub.root.setOnClickListener {
            val intent = Intent(this, HalamanClubActivity::class.java)
            startActivity(intent)
        }

        binding.layoutCoach.root.setOnClickListener {
            val intent = Intent(this, HalamanCoachActivity::class.java)
            startActivity(intent)
        }

        binding.layoutTeam.root.setOnClickListener {
            val intent = Intent(this, HalamanTeamActivity::class.java)
            startActivity(intent)
        }
    }
}