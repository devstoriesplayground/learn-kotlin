package operator

// Logical operators are used in control flow such as if expression, when expression, and loops.

fun main() {

    val a = 10
    val b = 9
    val c = -1

    // result is true is a is largest
    val result: Boolean = (a>b) && (a>c) // result = (a>b) and (a>c)
    println(result) // true
}