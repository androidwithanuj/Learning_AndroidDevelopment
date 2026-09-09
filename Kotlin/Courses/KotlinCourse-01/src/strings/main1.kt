package strings

fun main() {
    val str = "Have a wonderful day \n".repeat(10)
    println(str)

    val str2 = """
        lorem ipsum dolor sit amet 0
        lorem ipsum dolor sit amet 1
        lorem ipsum dolor sit amet 2
        lorem ipsum dolor sit amet 3
        lorem ipsum dolor sit amet 4
        lorem ipsum dolor sit amet 5
        lorem ipsum dolor sit amet 6
    """.trimIndent()
    println(str2)
}