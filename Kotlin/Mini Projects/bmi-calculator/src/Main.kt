fun main() {


    println("Input your height ")
    var height = readln().toDouble()
    println("Input your weight ")
    var weight = readln().toDouble()

    val bmi = weight / (height * height)
    println("Your current bmi is: $bmi")

    if (bmi < 18.5){
        println("Your current bmi is: $bmi: underweight")
    } else if (bmi < 25){
        println("Your current bmi is: $bmi: normal")
    } else if (bmi < 30){
        println("Your current bmi is: $bmi: overweight")
    } else {
        println("Your current bmi is: $bmi: obese")
    }

}