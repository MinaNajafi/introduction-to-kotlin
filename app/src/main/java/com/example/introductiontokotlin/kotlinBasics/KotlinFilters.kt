package com.example.introductiontokotlin.kotlinBasics

fun main() {
deepLookAtLazy()
}

fun compareEagerAndLazy() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")
}

fun deepLookAtLazy() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
}

fun mapSequenceFilteredList(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}

