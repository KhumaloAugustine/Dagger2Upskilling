package com.khumaloaugustine.dagger2car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {
    companion object{
        private const val TAG = "DaggerCar"
    }

    fun drive(){
        Log.d(TAG, "I am driving")
    }
}