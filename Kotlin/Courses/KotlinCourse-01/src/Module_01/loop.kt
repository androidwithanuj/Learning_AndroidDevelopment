package Module_01

fun main() {
    val text = "Hello for Loop"
    for (character in text) {
        println(character)
    }

    println("Inclusive")
    for (line in 1..10){
        println("line $line")
    }

    println("Exclusive")
    for (line in 1 until 10){
        println("line $line")
    }

    println("Steps")
    for (line in 1 .. 10 step 2){
        println("line $line")
    }

    println("DownToLoop")
    for (line in 10 downTo 1){
        println("line $line")
    }

    println("Nested Loops")
    for (i in 1..5){
        for (j in 1..i-2){
            print("*")
        }
        println()
    }
}