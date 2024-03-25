package lab4

fun main() {
    println("Введите первое число:")
    val first = readLine()!!.toInt()
    println("Введите второе число:")
    val second = readLine()!!.toInt()
    val max = if (first > second) first else second
    val min = if (first < second) first else second
    println(Array(max-min+1) { it + min }.toList().toTypedArray().joinToString(" "))
}