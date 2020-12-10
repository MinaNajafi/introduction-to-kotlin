package com.example.introductiontokotlin.kotlinBasics

fun main() {

    // by default, variables cannot be null
//    var rocks: Int = null

    // ? makes variable nullable
    var marbles: Int? = null

    // alternative way to check nullability in kotlin
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    fishFoodTreats = fishFoodTreats?.dec()

    //chain null tests
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    // bang bang throws NullPointerException if s is null
    val s = "hi"
    val len = s!!.length

}



