package com.example.introductiontokotlin.kotlinBasics

fun main() {

}

fun createLambdaFunction() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))
}


fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun createHigherOrderFunction() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))
}

fun increaseDirty(start: Int) = start + 1

fun createHigherOrderNonLambda() {
    println(updateDirty(15, ::increaseDirty))
}