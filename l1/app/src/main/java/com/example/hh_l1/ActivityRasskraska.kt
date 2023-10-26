package com.example.hh_l1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hh_l1.databinding.ActivityRasskraskaBinding

class ActivityRasskraska : AppCompatActivity() {

    private lateinit var binding: ActivityRasskraskaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRasskraskaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            buttonColor.setOnClickListener {
                bgLayout.setBackgroundColor(resources.getIntArray(R.array.array_color)[(0..6).random()])
            }
        }
    }
}