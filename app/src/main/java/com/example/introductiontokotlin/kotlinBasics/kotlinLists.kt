package com.example.introductiontokotlin.kotlinBasics

fun main() {

    //An array declared with arrayOf doesn’t have a type associated with the elements, so you can mix types.
    val mix = arrayOf("fish", 2)

    //Declare arrays with one type for all the elements.
    val numbers = intArrayOf(1, 2, 3)

}

fun createImmutableList() {
    val school = listOf("mackerel", "trout", "halibut")
    println(school)
}

fun createMutableList() {
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList.remove("shark"))
}

/**
 *In kotlin there is no mutable version of array. Once you create an array., the size is fixed.
 * */

fun createArray() {
    val school = arrayOf("shark", "salmon", "minnow")
    println(school.contentToString())
}

fun combineTwoArraysWithPlus() {

    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

}

fun combineDiffrentCombinations() {

    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    var oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    oddList = listOf(java.util.Arrays.toString(numbers), oceans, "salmon")
    println(oddList)

}

fun initArrayWithCode(){
    val array = Array (5) { it + 8 }
    println(java.util.Arrays.toString(array))
}

