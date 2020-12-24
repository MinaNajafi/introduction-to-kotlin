package com.example.introductiontokotlin.extensions

fun main() {

    standardCollections()

}

//standard collections
fun standardCollections() {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)  //class java.util.HashSet
    println(list.javaClass) //class java.util.ArrayList
    println(map.javaClass) //class java.util.HashMap

}




