package lab3

import kotlin.math.sqrt

fun main() {
    println("Введите число:")
    val input = readln().toInt()
    var output = mutableListOf(1)
    for (number in 2 until (sqrt(input.toDouble()).toInt()) + 1) {
        if (input % number == 0) {
            output.add(number)
            output.add(input/number)
        }
    }
    output.add(input)
    output.sort()
    println(output.joinToString(", "))
}
