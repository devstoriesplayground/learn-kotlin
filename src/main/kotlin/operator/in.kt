package operator

// The in operator is used to check whether an object belongs to a collection.

fun main() {

    val numbers = intArrayOf(1, 4, 42, -3)

    if (4 in numbers) {
        println("numbers array contains 4.")
    }
}