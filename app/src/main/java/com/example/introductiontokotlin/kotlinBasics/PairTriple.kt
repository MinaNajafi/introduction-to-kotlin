package com.example.introductiontokotlin.kotlinBasics

import android.os.Build

fun main() {

}

fun createPair() {
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")
}

fun createTriple() {
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())
}

fun createPairToPair() {
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")
}

fun destructingPair() {
    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")
}

fun destructingTriple() {
    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}

fun createHashMap() {
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["red sores"])
    println(cures["scale loss"])
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        println(cures.getOrDefault("bloating", "sorry, I don't know"))
    }
    println(cures.getOrElse("bloating") { "No cure for this" })

}

fun createMutableHashMap() {
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}