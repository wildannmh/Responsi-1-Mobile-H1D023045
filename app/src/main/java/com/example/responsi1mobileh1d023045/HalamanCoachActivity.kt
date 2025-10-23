package com.example.responsi1mobileh1d023045

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.responsi1mobileh1d023045.databinding.ActivityHalamanCoachBinding
import com.example.responsi1mobileh1d023045.data.network.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HalamanCoachActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHalamanCoachBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanCoachBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchCoachData()
    }

    private fun fetchCoachData() {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val response = RetrofitInstance.api.getTeam(404)
                if (response.isSuccessful) {
                    val coach = response.body()?.coach
                    binding.tvCoachName.text = coach?.name ?: ""
                    binding.tvCoachBirth.text = coach?.dateOfBirth ?: ""
                    binding.tvCoachCountry.text = coach?.nationality ?: ""
                    binding.imgCoach.setImageResource(R.drawable.coach)
                } else {
                }
            } catch (e: Exception) {
            }
        }
    }
}