fun main() {
    val doe = Person("Joe Doe", 100)
    println(doe.age)
}

class Person(name: String) {
    // init block is executed right after the instance creation
    var age: Int = 0
    init {
        println("Person has name property with value $name" )
        // println(age) will output initial value 0

    }

    //secondary constructor || make an explicit call to primary constructor property / params ie name
    constructor(name: String, age: Int): this(name) {
        this.age = age

    }

}


//fun main() {
//
//    var doe = Person()
//    doe.name = "Joe Doe"
//    println(doe.name)
//
//}
//
//class Person{
//      var name: String = ""
//}