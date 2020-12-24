package com.example.introductiontokotlin.generic

class AquariumGFunction<T> (val waterSupply: T){
    fun isWaterClean(aquarium: Aquarium<WaterSupply>) {
        println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
    }
}
