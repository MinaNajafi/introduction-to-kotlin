package com.example.introductiontokotlin.generic

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}