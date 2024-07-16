package com.bv.kotlin_basic

import java.lang.Exception

class Book(private val name: String, private val price:Int){
    private var bookName: String = name
        get() = field+"test"
        set(value) {
            println("Setting book name to: $value")
            field=value
        }



    fun getDetail(): String{
        return "Book Name:  $name\nPrice:$price"
    }
}


//primary constructor
class Car(val brand:String, val model:String){
    // secondary constructor
    constructor(brand:String, model:String, year:String):this(brand, model){
        println("Car Detail: \n$brand\n$model\n$year")
    }
}


// inheritance

open class Animals{
   open  fun sound(){
   }
   open  fun walk(){}
}

class Dog :Animals(){
    override fun sound() {
       println("Dog Bark")
    }

    override fun walk() {
        println("walk with four leg")
    }
}

class Human :Animals(){
    override fun sound() {
        println("Sounds sweet")
    }

    override fun walk() {
        println("Walk in to leg")
    }
}

// interface
interface  GearBox{
    val gearLimit:Int
    fun onChangedGear():String

}

class Truck(override val gearLimit: Int) : GearBox {
    init {
        if(gearLimit > 5 || gearLimit<=0){
            throw Exception("Invalid gear number")
        }
    }

    override fun onChangedGear():String {
        var gearTest:String = ""
        for(i in 1..gearLimit){
         gearTest=   when(i){
                1-> "Current torque is 2000 rpm"
                2-> "Current torque is 400 rpm"
                3-> "Current torque is 600 rpm"
                4-> "Current torque is 800 rpm"
                5 -> "Current torque is 1000 rpm"
                else-> "Gear malfunction"
            }
        }
        return  gearTest
    }
}

