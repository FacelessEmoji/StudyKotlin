package lab5

fun Int.years(): String {
    return when {
        this % 10 == 1 && this % 100 != 11 -> "$this год"
        this % 10 in 2..4 && (this % 100 < 10 || this % 100 >= 20) -> "$this года"
        else -> "$this лет"
    }
}

fun main() {
    println(1.years())
    println(2.years())
    println(5.years())
    println(21.years())
    println(22.years())
    println(25.years())
}
