package com.example.introductiontokotlin.kotlinBasics

fun main() {
    var rocks: Int? = 3
}

fun makeForLoop() {
    val school = arrayOf("shark", "salmon", "minnow")

    for (element in school) {
        print(element + " ")
    }
}

fun loopElementAndIndex() {
    val school = arrayOf("shark", "salmon", "minnow")

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
}

fun diffrentStep() {
    for (i in 1..5) print(i)

    println("\n step 1")


    for (i in 5 downTo 1) print(i)
    println("\n step backward 1")


    for (i in 3..6 step 2) print(i)
    println("\n step 2")


    for (i in 'd'..'g') print(i)
    println("\n step alphabetically")

}


fun repeatLoop() {
    repeat(4) {
        println("A fish is swimming")
    }
}