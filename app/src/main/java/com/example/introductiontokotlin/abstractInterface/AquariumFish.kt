package com.example.introductiontokotlin.abstractInterface

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark : AquariumFish() {
    override val color = "gray"
}

class Plecostomus : AquariumFish() {
    override val color = "gold"
}
