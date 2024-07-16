package com.bv.kotlin_basic

import java.util.function.BinaryOperator

fun main(){
    // object initiation
    val book:Book = Book("Biology", price = 200)
    println("Details: ${book.getDetail()}")
    book

    val tesla:Car = Car("Tesla", "T1", "1900")

    val human:Animals = Human()
    human.walk()
    human.sound()

    val dog:Animals = Dog()

    dog.walk()
    dog.sound()

    val turk:GearBox = Truck(gearLimit = 5)

    println(turk.getType())

    println(turk.onChangedGear())

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