package com.bv.kotlin_basic

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
