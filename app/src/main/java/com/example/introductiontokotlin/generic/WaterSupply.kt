package com.example.introductiontokotlin.generic

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
   fun addChemicalCleaners() {
       needsProcessing = false
   }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}