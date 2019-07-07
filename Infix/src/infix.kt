/**
 * An extension function that takes one parameter and is prefixed with 'infix'
 */
fun main() {
    val test = "floccinaucinihilipilification"
    val word = "hi"


    println(word.longer(test))
    println(word longer test)

    //both expressions are the same


}

infix fun String.longer(otherWord: String): String {
    if (this.length > otherWord.length) return "$this is longer"
    else return "$this is shorter"

}