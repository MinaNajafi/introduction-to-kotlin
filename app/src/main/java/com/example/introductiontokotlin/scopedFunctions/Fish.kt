package com.example.introductiontokotlin.scopedFunctions

data class Fish(var name: String)

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
