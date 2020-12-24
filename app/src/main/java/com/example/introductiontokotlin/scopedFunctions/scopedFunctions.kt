package com.example.introductiontokotlin.scopedFunctions

fun main() {

    fishExamplesLet()
}

fun fishExamples() {

    val fish = Fish("splashy")  // all lowercase
    myWith(fish.name) {
        println(capitalize())
    }

}

fun fishExamplesRun() {

    val fish = Fish("splashy")  // all lowercase
    println(fish.run {
        name
    })

}

fun fishExamplesApply() {
    val fish2 = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2.name)
}

fun fishExamplesLet() {
    val fish = Fish("splashy")  // all lowercase

    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })
    println(fish)
}