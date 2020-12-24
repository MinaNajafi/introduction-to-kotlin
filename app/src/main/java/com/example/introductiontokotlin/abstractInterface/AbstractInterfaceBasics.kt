package com.example.introductiontokotlin.abstractInterface


fun main () {
    makeFish()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}
