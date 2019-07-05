/**
 * TIP: Useful in extending functions of predefined classes
 */
fun main() {
    var test = "floccinaucinihilipilification"


    println(test.altCase())

}

fun String.altCase(): String{
    var convertedWord = ""

    for (index in this.indices){
        if (index % 2 == 1) convertedWord += this[index].toUpperCase()
        else convertedWord += this[index]
    }

    return convertedWord

}