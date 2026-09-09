package strings

fun main() {

    val language = "Hindi"
    val length = language.length
    println("Length is : $length")

    val empty = ""
    println(empty.length)

    val firstName = "Arpit"
    val secondName = "Singh"

    val fullName = firstName + " " + secondName
    println(fullName)

    val str1 = firstName + 10 + false
    println(str1)

}