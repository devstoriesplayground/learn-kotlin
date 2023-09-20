package operator

/*
  Operators are special symbols (characters) that carry out operations on operands (variables and values).
  For example, + is an operator that performs addition.


    Operator	Meaning
    +	Addition (also used for string concatenation)
    -	Subtraction Operator
    *	Multiplication Operator
    /	Division Operator
    %	Modulus Operator
*/

fun main() {

    val number1 = 12.5
    val number2 = 3.5

    var result: Double = number1 + number2
    println("number1 + number2 = $result") // number1 + number2 = 16.0

    result = number1 - number2
    println("number1 - number2 = $result") // number1 - number2 = 9.0

    result = number1 * number2
    println("number1 * number2 = $result") // number1 * number2 = 43.75

    result = number1 / number2
    println("number1 / number2 = $result") // number1 / number2 = 3.5714285714285716

    result = number1 % number2
    println("number1 % number2 = $result") // number1 % number2 = 2.0
}