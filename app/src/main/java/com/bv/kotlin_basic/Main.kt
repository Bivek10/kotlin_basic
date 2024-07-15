package com.bv.kotlin_basic

fun main(){
    println("Hello world")
    printMessage("Hello Bivek")
    println("sum:: ${sum(10, 50)}")
    println("Multiply:: ${multiply(10, 10)}")

    printMessageWithPrefix(message = "test name argument")
    printMessageWithPrefix("actual message", "hello prefix")
    printMessageWithPrefix(prefix = "prefix first", message = "test")

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