import java.awt.Choice

fun main() {

    val options = arrayOf(ROCK,PAPER,SCISSORS)
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

const val ROCK = "Rock"
const val PAPER = "Paper"
const val SCISSORS = "Scissors"

fun getGameChoice(options: Array<String>): String = options.random()

fun getUserChoice(options: Array<String>):String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please chose any of the following:")
        for (items in options) print(" $items")
        print(".")
        val userChoiceInput = readln()
        if (userChoiceInput in options) {
            isValidChoice = true
            userChoice = userChoiceInput
        }else{
            println("Please choose a user choice.")
        }
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result = if (userChoice == gameChoice){
        "Tie"
    } else if (
        (userChoice == ROCK && gameChoice == SCISSORS) ||
        (userChoice == PAPER && gameChoice == ROCK) ||
        (userChoice == SCISSORS && gameChoice == PAPER)

    ) {
        "You Win"
    } else {
        "You Lose"
    }
}