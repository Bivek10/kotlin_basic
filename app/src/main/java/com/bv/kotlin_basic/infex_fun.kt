package com.bv.kotlin_basic

class Person(val name:String){
    private val likedPerson =  mutableListOf<Person>()

    infix  fun likes(other:Person){
        println("liked person after $likedPerson")
        likedPerson.add(other)
        println("liked person before $likedPerson")
    }
}
