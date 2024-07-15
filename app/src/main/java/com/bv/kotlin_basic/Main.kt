package com.bv.kotlin_basic

import java.util.function.BinaryOperator

fun main(){
    println("Hello world")
    printMessage("Hello Bivek")
    println("sum:: ${sum(10, 50)}")
    println("Multiply:: ${multiply(10, 10)}")

    printMessageWithPrefix(message = "test name argument")
    printMessageWithPrefix("actual message", "hello prefix")
    printMessageWithPrefix(prefix = "prefix first", message = "test")

    //infix function
    val person1= Person("Bivek")
    val person2= Person("Ram")

    person1 likes  person2
    // infix extension fun on int
    infix fun Int.times(str:String) = str.repeat(this)
    println(0 times "bye")

    infix fun String.onto(other:String)= Pair(this, other)

    val myValue = "ram".onto("sita")

    println(myValue)

    //varargs
    printAll("ram", "shyam", "hari")

    log("Hello", "Hallo", "Salut", "Hola", "你好")

    val bike: Bike = Bike(color = "Red", capacity= 200.0, speedLimit = 120, wheel = "4");
    println(bike.getVehicleDetail())

    println(calulator(5,5, ::sum))
    println(calulator(10,11, ::multiply))
}


fun printMessage (message:String): Unit{
    println("message $message")
}

fun sum (a:Int, b:Int): Int{
    return  a+b
}

fun multiply(x:Int, y:Int)= x*y;

fun printMessageWithPrefix(message: String, prefix:String ="default"){
  println("$prefix $message")
}

fun printAll(vararg messages:String){
    for (m in messages) println(m)
}

fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
}

//Taking the fun as parameters
fun calulator(x:Int, y:Int, operator: (Int, Int)->Int):Int{
    return  operator(x, y);
}