package lab6

fun <T, R> List<T>.customMap(transform: (T) -> R): List<R> {
    val result = mutableListOf<R>()
    for (item in this) {
        result.add(transform(item))
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.customMap { it * it }
    println(squaredNumbers) // [1, 4, 9, 16, 25]
}
