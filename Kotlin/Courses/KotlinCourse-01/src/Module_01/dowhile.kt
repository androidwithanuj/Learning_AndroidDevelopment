package Module_01


fun main() {
    do {
        println("Enter a number or 0 to quit")
        val input = readln().toInt()
    } while (input != 0)

    myFirstFunction()
    printSum(4,78)

    println(max(45,477))
}

fun myFirstFunction() {
    println("My First function")
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}