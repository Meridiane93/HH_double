package com.example.hh_l1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hh_l1.databinding.ActivityAlbumBinding

class ActivityAlbum : AppCompatActivity() {

    private lateinit var binding: ActivityAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageArray = arrayOf(
            R.drawable.beer,
            R.drawable.breed,
            R.drawable.cats,
            R.drawable.hom,
            R.drawable.dogs,
            R.drawable.panda,
            R.drawable.tigree
        )

        with(binding) {
            btnLucky.setOnClickListener {
                imRandom.setImageResource(imageArray[(0..6).random()])
            }
        }

    }
}