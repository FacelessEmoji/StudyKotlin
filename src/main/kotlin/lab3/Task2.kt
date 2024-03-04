package lab3

import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 10)
    do {
        println("Введите число:")
        val input = readln().toInt()
    } while (input != randomNumber)
    println("Поздравляю, загаданное число: $randomNumber")
}