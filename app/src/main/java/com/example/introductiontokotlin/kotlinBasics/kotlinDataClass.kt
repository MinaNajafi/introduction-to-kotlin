package com.example.introductiontokotlin.kotlinBasics

import com.example.introductiontokotlin.dataclass.Decoration
import com.example.introductiontokotlin.dataclass.Decoration2

fun main(){

}

fun makeDecoration() {
    val decoration1 = Decoration("granite")
    println(decoration1)
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    //Compare objects with equals that data class provided

    println(decoration1 == decoration2)
    println(decoration3 == decoration2)

}


fun makeDecorationsDestructing() {
    val d5 = Decoration2("crystal"
        , "wood", "diver")
    println(d5)

    // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    val (rock2, _, diver2) = d5

}