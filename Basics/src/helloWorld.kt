import samplePackage.Person

fun main(args: Array<String>) {
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

    /*
    * ===Ranges
    * */

    // ascending
    val ascending = 1..5
    println(ascending)

    //descending
    val descending = 5 downTo 1

    // excluding values in range
    val select = 1..10 step 2
    println(1 in select)
    println(2 in select)

    // for string characters
    val charStr = "a".."z"
    println("a" in charStr)

    // for characters
    val chars = 'a'..'z'

    /*
    *
     * If expression
     */
    var max = if (num > a)
        a
    else num

    println("Max = $max")

}