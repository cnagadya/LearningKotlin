fun main(args: Array<String>) {
    println("The max value of the two inputs is ${max(40, 5)}")
}


fun max(x: Int, y: Int): Int = if (x > y) x else y

/**
 * above code as a statement
 */
//fun max(x: Int, y: Int): Int {
//    val higher: Int = if (x > y) x else y
//    return higher
//}
//======OR=======
//fun max(x: Int, y: Int): Int {
//    if (x > y)
//        return x
//    else
//        return y
//}
//======OR=======
//fun max(x: Int, y: Int): Int {
//    if (x > y)
//        return x
//    else
//        return y
//}



