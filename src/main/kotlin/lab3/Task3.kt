package lab3

fun main() {
    println("Введите число:")
    val input = readln().toInt()
    var output = mutableListOf(1)
    for (number in 2 until input + 1) {
        if (input % number == 0) {
            output.add(number)
        }
    }
    println(output.joinToString(", "))
}
