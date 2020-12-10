package com.example.introductiontokotlin

import com.example.introductiontokotlin.model.User

fun main() {

}

fun createUserKotlinDataClass(){
    val user1 = User("Jane", "Doe")
    val user2 = User("Jane", "Doe")
    val structurallyEqual = user1 == user2 // true
    val referentiallyEqual = user1 === user2 // false
}

fun createUserArguments(){

}