package com.example.hh_l1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hh_l1.databinding.ActivityRasskraskaBinding

class ActivityRasskraska : AppCompatActivity() {

    private lateinit var binding: ActivityRasskraskaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRasskraskaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            buttonColor.setOnClickListener {
                bgLayout.setBackgroundColor(resources.getIntArray(R.array.array_color)[(0..6).random()])
            }

            btnCheckColor.setOnClickListener {

                if (edColor.text.isEmpty())
                    Toast.makeText(
                        this@ActivityRasskraska,
                        getString(R.string.toast_empty),
                        Toast.LENGTH_LONG
                    )
                        .show()
                else {
                    val edText = edColor.text.toString()

                    val colorWithoutHash =
                        if (edColor.text.toString()[0] == '#') edText.substring(1) else edText

                    val red = Integer.parseInt(colorWithoutHash.substring(0, 2), 16)
                    val green = Integer.parseInt(colorWithoutHash.substring(2, 4), 16)
                    val blue = Integer.parseInt(colorWithoutHash.substring(4, 6), 16)

                    bgLayout.setBackgroundColor(Color.rgb(red, green, blue))

                }
            }

        }

    }

}