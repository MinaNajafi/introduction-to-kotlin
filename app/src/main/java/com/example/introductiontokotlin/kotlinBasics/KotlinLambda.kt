package com.example.introductiontokotlin.kotlinBasics

fun main() {
    createLastCallSyntaxKotlin()
}

fun createLambdaFunction() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun increaseDirty(start: Int) = start + 1

fun increase(str: Int): Int {
    return str + 4
}
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun createHigherOrderNonLambda() {
    println(updateDirty(15, ::increaseDirty))
}

fun createHigherOrderFunction(){
    //create with function
    println(updateDirty(15, ::increase))
    //create with comact fucntion
    println(updateDirty(15, ::increaseDirty))
    //create with lambda
    println(updateDirty(30, waterFilter))
    //create with lambda and last call syntax
    println(updateDirty(40) { dirtyLevel -> dirtyLevel * 1200 })
}

fun createLastCallSyntaxKotlin() {
    val dirtyLevel = 50
    println(updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel * 1200 })
}