package com.kotlin

import com.java.JavaClass

//@file:JvmName("CustomName") setting a custom name for the compiled class
fun main(){
    JavaClass.printfromJava("Christine")

}

@JvmOverloads // needed for Java for default params
fun printer(name: String = "Doe"){
    println("Hello $name, I am from Kotlin")

}