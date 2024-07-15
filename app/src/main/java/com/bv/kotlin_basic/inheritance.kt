package com.bv.kotlin_basic

import java.lang.IllegalArgumentException

open class Vehicle(val color:String, val wheel:String, val capacity:Double){
   open fun getVehicleDetail():String{
        return  " Color: $color \n Wheel: $wheel \n Capacity: $capacity"
    }
}


class Bike(color:String, wheel:String, capacity: Double, var speedLimit: Int): Vehicle(color, wheel, capacity){
    // initialization goes here
    init {
        if(this.speedLimit <=0){
         throw IllegalArgumentException("throw IllegalArgumentException(\"Speed cannot be zero\")")
        }
    }
    override fun getVehicleDetail(): String {
        return " ${super.getVehicleDetail()} \n Speed Limit: $speedLimit"

    }
}

