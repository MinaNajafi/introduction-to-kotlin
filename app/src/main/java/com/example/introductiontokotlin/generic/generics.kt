package com.example.introductiontokotlin.generic

fun main() {


    genericsExample()

//    genericsExampleAccessWithoutCast()

//    genericsExampleCheckCleanerEffect()

}

fun genericsExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
}

fun genericsExampleAccessWithoutCast() {
    val aquarium =
        Aquarium<TapWater>(TapWater()) //you can remove type in <> because its infered from TapWater()
//    val aquarium= Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
}

fun genericsExampleCheckCleanerEffect() {
    val aquarium = Aquarium<TapWater>(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
}

fun genericsExampleSpecific() {
    val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)
}

fun genericsExampleWithNull() {
    val aquarium3 = Aquarium(null)
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }
}

fun genericsExampleCheckError() {
    val aquarium4 = AquariumCheck(LakeWater())
    aquarium4.addWater()
}

fun genericsExampleCheck() {
    val aquarium4 = AquariumCheck(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}

fun genericExampleOut() {
    val aquarium = AquariumOut(TapWater())
    addItemTo(aquarium)
}

fun addItemTo(aquarium: AquariumOut<WaterSupply>) = println("item added")

fun genericsExampleIn() {
    val cleaner = TapWaterCleaner()
    val aquarium = AquariumIn(TapWater())
    aquarium.addWater(cleaner)
}


interface Producer<out T> {
    fun produce(): T
}

class ReadOnlyBox<out T>(private var item: T) {
    fun getItem(): T = item
}


interface Consumer<in T> {
    fun consume(t: T)
}

class WriteOnlyBox<in T>(private var item: T) {
    fun setItem(newItem: T) {
        item = newItem
    }
}



