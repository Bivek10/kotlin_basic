package com.bv.kotlin_basic


//when statements
fun cases(Obj:Any) {
   val result= when (Obj) {
        1 -> println("one")
        "hello" -> println("Hello world")
        is Long -> println("Long type")
        else -> println("Unknown")
    }
    println(result)
}

// for loop
fun forLoop(){
    val cakes:List<String> = listOf<String>("carrot", "cheese", "chocolate")
    for(cake in cakes){
        println("Yummy, it is $cake cake !")
    }
}

//do while
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun whileLoop(args: Array<String>) {
    var cakesEaten:Int =0
    var cakesBaked:Int = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}


// iterator
class Animal(val name:String)

class Zoo(private val animals:List<Animal>){
    operator fun iterator():Iterator<Animal>{
        return  animals.iterator();
    }

}

fun callIterator(){
    val zoo:Zoo = Zoo(listOf(Animal("Tiger"), Animal("Lion"), Animal("Zebra")))
    for (animal in zoo){
        println("Animal name: ${animal.name}")
    }
}


//Range

