package com.example.introductiontokotlin.kotlinBasics

import com.example.introductiontokotlin.classes.*

fun main () {
}

fun buildAquarium(){
   val myAquarium = Aquarium()
}

fun buildAquariumFunctionCall(){
    val myAquarium = Aquarium()
        myAquarium.printSize()
}

fun buildCustomizeAquariumFunctionCall(){
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}


fun buildAquariumConstructor() {
    val aquarium1 = AquariumConstructor()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = AquariumConstructor(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = AquariumConstructor(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = AquariumConstructor(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}

fun buildAquariumSecoundConstructor() {
    val aquarium6 = AquariumSecoundConstructor(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")
}

fun buildAquariumSubClass(){
    val myAquarium = AquariumSubclass(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = AquariumSubclass.TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}