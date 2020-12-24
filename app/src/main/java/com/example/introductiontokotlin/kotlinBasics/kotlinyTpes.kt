package com.example.introductiontokotlin.kotlinBasics

fun main() {
    numbersWithUnderscore()


}


fun variables() {
    val a = 1
    var b = 2

    b = 3

    //TODO : uncomment below line , immutable objects cant be re-assign
//    a=3

}

fun numbers() {
    val a: Int = 1000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Your Int Value is " + a)
    println("Your Double  Value is " + d)
    println("Your Float Value is " + f)
    println("Your Long Value is " + l)
    println("Your Short Value is " + s)
    println("Your Byte Value is " + b)
}

fun characters() {
    val letter: Char    // defining a variable
    letter = 'A'        // Assigning a value to it
    println("$letter is a character sample")
}

fun booleans() {
    val letter: Boolean   // defining a variable
    letter = true         // Assinging a value to it
    println("Boolean value is " + "$letter")
}

fun strings() {
    var rawString: String = "I am Raw String!"
    val escapedString: String = "I am escaped String!\n"

    println("Hello!" + escapedString)
    println("Hey!!" + rawString)
}

fun castInKotlin() {

    val b2: Byte = 1
    println(b2)

//    val i1: Int = b2
//
//    val i2: String = b2
//
//    val i3: Double = b2

    val i: Int = 10

    val castToString: String = i.toString()
    val castToFloat: Float = i.toFloat()

}


fun numbersWithUnderscore() {
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
}


fun varInterpolationStringTemplate() {
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
}


fun varInterpolationStringTemplateExp() {
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}








