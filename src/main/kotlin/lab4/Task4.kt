package lab4

fun main() {
    println("Введите элементы массива, разделенные запятыми:")
    val input = readLine() ?: ""
    val numbers = input.split(",").map { it.trim().toInt() }
    if (numbers.size < 2) {
        println("Массив должен содержать как минимум два элемента")
        return
    }
    println("Второй по величине элемент массива: ${numbers.sorted()[1]}")
}
