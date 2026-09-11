package Module_02

fun main() {
    var language: String? = "Kotlin"
//    language = null
    val upperCase = language?.uppercase() ?: "There is nothing to do "
    val lowerCase = language?.lowercase() ?: "There is nothing to do "

    language?.let {
        println(it.uppercase())
        println(it.lowercase())
        println(it.length)
    }
    println(upperCase)

}