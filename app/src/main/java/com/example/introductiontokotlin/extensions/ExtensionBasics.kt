package com.example.introductiontokotlin.extensions

import com.example.introductiontokotlin.model.User


fun main() {

    println("Does it have spaces?".hasSpaces())
    println("Does it have spaces?".hasSpacesSingleExpression())


    val plant =
        GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?



    // Extension function and property usages
    // usage:
    val user = User("mina" , "n")
    val name = user.getFormattedName()
    val formattedName = user.userFormattedName



    "hi".repeat(10)

}

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpacesSingleExpression() = find { it == ' ' } != null

//Tip: Files don't have to have the same name as their class, and you can have multiple classes in a file.

class AquariumPlantP(val color: String, private val size: Int)

fun AquariumPlantP.isRed() = color == "red"    // OK
//fun AquariumPlantP.isBig() = size > 50 // uncomment to checkout private behaviour im extensions

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

//property extension

val AquariumPlant.isGreen: Boolean
    get() = color == "green"


// extension function
fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "Unknown"
    }
}

// extension property
val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }



fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}