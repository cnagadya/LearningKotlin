import samplePackage.Person

fun main(args: Array<String>){
    var a: Int
    var num = 10

    val constant = "I can not change"

//    constant = "Try me" ===will throw an error
    a = 4
    println("Hello World ${num + a}  $constant")
    println(9 * 2.4)


    var newPerson = Person("Ugandan")
    newPerson.displayName("Christine")
    newPerson.age = 100
    newPerson.displayAge(newPerson.age) //simply using age wont work
    newPerson.displayNationality()
}