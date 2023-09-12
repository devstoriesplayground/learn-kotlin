package datatype

// The Byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
// It is used instead of Int or other integer data types to save memory if it's certain that the value of a variable will be within [-128, 127]

fun main() {
    val range: Byte = 112
    println("$range")

    // The code below gives error. Why?
    // val range1: Byte = 200
}