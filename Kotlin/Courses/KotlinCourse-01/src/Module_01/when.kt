package Module_01

fun main() {

    println("Enter a number ")
    val number = readln().toInt()

    when (number % 2) {
        0 -> println("Number is even")
        1 -> println("Number is odd")
    }

    println("Enter a hour ")
    val hour = readln().toInt()

    val message = when (hour) {
        in 0..12 -> {
            "Good Morning"
        }
        in 13..17 -> {
            "Good Afternoon"
        }
        in 18..20 -> {
            "Good Evening"
        }
        in 21..24 -> {
            "Good Night"
        }
        else -> {
            "Invalid Hour"
        }
    }

    println(message)
}