package Input

fun main() {
    val name = readln()
    println("Your name is $name")

    val line = readln()
    val number = line!!.toInt()
    println("Your number is $number")
}