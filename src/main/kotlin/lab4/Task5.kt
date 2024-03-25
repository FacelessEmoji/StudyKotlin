package lab4

fun main() {
    println("Введите элементы массива, разделенные запятыми:")
    val input = readLine() ?: ""
    val numbers = input.split(",").map { it.trim().toInt() }

    val sortedNumbers = numbers.sorted()

    println("Отсортированный массив в порядке возрастания:")
    println(sortedNumbers.joinToString(", "))
}

