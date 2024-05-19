package lab5

import java.util.*

fun calculateFinalPrice(initialPrice: Double, discountPercent: Double): String {
    val discountedPrice = initialPrice * (1 - discountPercent / 100)
    return "%.2f".format(Locale.US, discountedPrice)
}

fun main() {
    val initialPrice = 99.9
    val discountPercent = 20.0
    val finalPrice = calculateFinalPrice(initialPrice, discountPercent)
    println("Исходная цена: $initialPrice")
    println("Процент скидки: $discountPercent%")
    println("Конечная цена с учетом скидки: $finalPrice")
}
