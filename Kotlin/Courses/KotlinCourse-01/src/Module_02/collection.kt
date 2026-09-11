package Module_02

fun main() {
    val numbers = arrayOf(1,2,3,4,5,6,7)
    println(numbers.contentToString())

    for (index in numbers.indices) {
        println(numbers[index])
    }

    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    println(list)
    println( "Size : " + list.size )

    val set = setOf(1,2,3,4,5,5,6,6,7,8)
    println(set)

    // Maps
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
}