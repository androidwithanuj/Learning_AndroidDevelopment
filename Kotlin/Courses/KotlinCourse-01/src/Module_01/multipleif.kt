package Module_01

fun main() {

    val number = (-20..20).random()

    if (number > 0){
        println("The number is positive: $number")
    }

    if (number < 0) {
        println("The number is negative: $number")
    }

    if (number == 0){
        println("The number is zero: $number")
    }

}