package com.example.hh_l1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hh_l1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            btnBallOfFate.setOnClickListener {
                startActivity(Intent(this@MainActivity, ActivityBall::class.java))
            }

            btnAlbum.setOnClickListener {
                startActivity(Intent(this@MainActivity, ActivityAlbum::class.java))
            }

            btnRasskraska.setOnClickListener {
                startActivity(Intent(this@MainActivity, ActivityRasskraska::class.java))
            }
        }
    }
}