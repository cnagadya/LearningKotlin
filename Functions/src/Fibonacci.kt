import java.math.BigInteger

/**
 * optimise recursion hence preventing the stackover flow exception
 * */


// fibonacci series = each no is the sum of its two preceding numbers ie Fn = Fn-1 + Fn-2
fun main() {
    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0)
        return  b
    else
        return getFibonacciNumber(n - 1, a + b, a)
}