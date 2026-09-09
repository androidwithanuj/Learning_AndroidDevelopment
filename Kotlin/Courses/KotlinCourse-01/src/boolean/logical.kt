package boolean

fun main() {
    var humid = true
    var raining = true
    var jacket = false

    println(!humid)  // false
    println(raining && jacket)  //false
    println(humid || jacket)  // true
}