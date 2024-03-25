package lab4

fun main() {
    println("Введите элементы массива, разделенные запятыми:")
    val input = readLine() ?: ""
    val numbers = input.split(",").map { it.trim().toInt() }

    val average = numbers.average()

    println("Среднее арифметическое элементов массива: $average")

    println("Элементы массива, большие среднего арифметического:")
    for (number in numbers) {
        if (number > average) {
            println(number)
        }
    }
}
