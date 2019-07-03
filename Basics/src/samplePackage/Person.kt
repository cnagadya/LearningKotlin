package samplePackage

class Person(var nationality: String) {

    var age: Number = 0 //age is declared as a field variable of the class
    fun displayAge(age: Number) {
        println("Your age is ${age}")
    }

    fun displayNationality() {
        println(nationality)
    }

    fun displayName(name: String) {
        println(name)
    }


}