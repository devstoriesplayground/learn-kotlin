package introduction

// val (Immutable reference) - The variable declared using val keyword cannot be changed once the value is assigned.
// var (Mutable reference) - The variable declared using var keyword can be changed later in the program. It corresponds to regular Java variable.

fun main(args: Array<String>) {
    var language = "Java"
    val score = 95

    language = "Kotlin"
    println(language)
    println(score)
}