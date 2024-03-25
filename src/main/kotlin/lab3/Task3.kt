package lab3

fun main() {
    println("Введите число:")
    val input = readln().toInt()
    var output = mutableListOf(1)
    for (number in 2 until (input/2) + 1) {
        if (input % number == 0) {
            output.add(number)
        }
    }
    output.add(input)
    println(output.joinToString(", "))
}
