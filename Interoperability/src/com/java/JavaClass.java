package com.java;

import com.kotlin.InteroperabilityKt;

public class JavaClass {
    public static void main(String[] args) {
        InteroperabilityKt.printer("Christine");
        InteroperabilityKt.printer();

    }

    public static void printfromJava(String name) {
        System.out.println("Hello" + name + "I am from Java");

    }
}
