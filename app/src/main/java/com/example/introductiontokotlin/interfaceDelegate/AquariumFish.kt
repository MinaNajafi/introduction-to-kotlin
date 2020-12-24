package com.example.introductiontokotlin.interfaceDelegate

class AquariumFish {

    interface FishAction {
        fun eat()
    }

    interface FishColor {
        val color: String
    }

    class Plecostomus: FishAction, FishColor {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }

    class Shark: FishAction, FishColor {
        override val color = "gray"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class PlecostomusIDelegation:  FishAction, FishColor by GoldColor {
        override fun eat() {
            println("eat algae")
        }
    }

    class PrintingFishAction(val food: String) : FishAction {
        override fun eat() {
            println(food)
        }
    }



}