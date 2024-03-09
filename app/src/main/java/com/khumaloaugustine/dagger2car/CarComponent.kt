package com.khumaloaugustine.dagger2car

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}