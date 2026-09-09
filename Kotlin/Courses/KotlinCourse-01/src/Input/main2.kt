package Input

fun main() {
//    val a = readln()
//    val b = readln().toInt()
//    val c = readln()
//
//    print(a)
//    print(" ")
//    print(b)
//    print(" ")
//    print(c)

    val(firstName, secondName) = readln()!!.split(" ")
    println("First Name: $firstName")
    println("Second Name: $secondName")

}