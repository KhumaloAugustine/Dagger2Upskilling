package com.khumaloaugustine.dagger2car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent= DaggerCarComponent.create()

        val car = carComponent.getCar()
        car.drive()
    }
}