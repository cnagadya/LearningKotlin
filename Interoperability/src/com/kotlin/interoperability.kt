package com.kotlin

import com.java.JavaClass

//@file:JvmName("CustomName") setting a custom name for the compiled class
fun main(){
    JavaClass.printfromJava("Christine")

}

fun printer(name: String){
    println("Hello $name, I am from Kotlin")

}