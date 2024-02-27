package lab1

fun main() {
    countTime(2642)
}

fun countTime(days: Int){
    println("Лет: ${days/365}, недель: ${days%365/7}, дней: ${days%365%7}")
}