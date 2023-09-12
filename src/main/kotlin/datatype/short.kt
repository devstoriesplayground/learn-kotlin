package datatype

// The Short data type can have values from -32768 to 32767 (16-bit signed two's complement integer).
// It is used instead of other integer data types to save memory if it's certain that the value of the variable will be within [-32768, 32767].


fun main() {

    val temperature: Short = -11245
    println("$temperature")
}