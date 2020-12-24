package com.example.introductiontokotlin.generic

class AquariumCheck<T : WaterSupply>(val waterSupply: T) {



    fun addWater() {
        check(!waterSupply.needsProcessing) { println("water supply needs processing first") }
        println("adding water from $waterSupply")
    }


}