package operator

/* Unary operators apply to only one operand. The below table has all the unary operators:
+	Unary plus	+a	a.unaryPlus()
-	Unary minus (inverts sign)	-a	a.unaryMinus()
!	not (inverts value)	!a	a.not()
++	Increment: increases value by1	++a	a.inc()
--	Decrement: decreases value by 1	--a	a.dec() */

fun main() {
    val a = 1
    val b = true
    var c = 1

    var result: Int
    var booleanResult: Boolean

    result = -a
    println("-a = $result")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")
}