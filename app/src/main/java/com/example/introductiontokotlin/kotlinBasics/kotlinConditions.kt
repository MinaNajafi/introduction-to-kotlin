package com.example.introductiontokotlin.kotlinBasics


fun main() {

}

fun conditions() {
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
}

fun rangeConditions() {
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
}

fun multipleCases() {
    val numberOfFish = 50

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
}

/**
 * same as java switch
 * else is default branch
 */
fun whenStatement() {
    val numberOfFish = 50

    when (numberOfFish) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

}
