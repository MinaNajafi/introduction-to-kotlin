package com.example.introductiontokotlin.generic

class AquariumOut<out T: WaterSupply>(val waterSupply: T) {

}