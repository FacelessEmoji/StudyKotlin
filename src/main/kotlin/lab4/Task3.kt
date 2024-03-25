package lab4

fun main() {
    println("Введите список чисел, разделенных запятыми:")
    val input = readLine() ?: ""
    val array = input.split(",").map { it.toInt() }.toMutableList()
    val minElement = array.minOrNull()
    val maxElement = array.maxOrNull()
    println("Минимальный элемент: $minElement")
    println("Максимальный элемент: $maxElement")
}

