fun main() {

    /**
     * When Statement
     */

    val x = 4 // test with 1 and any other number

    when (x) {
        0, 1 -> println("x is $x") // check 2 values
        2 -> println("x is 2")

        in 3..7 -> println("x is $x which is between 3 and 7, inclusive")

        // use else for default statement
        else -> println("unexpected value for x")
    }

    //ps can also be used as an expression just like the if

}