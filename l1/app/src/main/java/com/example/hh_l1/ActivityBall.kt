package com.example.hh_l1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hh_l1.databinding.ActivityBallBinding

class ActivityBall : AppCompatActivity() {

    private lateinit var binding: ActivityBallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBallBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnAnswer.setOnClickListener {
                tvRandom.text = (resources.getStringArray(R.array.random_array))[(0..9).random()]
            }
        }
    }
}