package lab7

import kotlinx.coroutines.delay

// Простая suspend функция, которая приостанавливается на 1 секунду
suspend fun suspendFunction() {
    println("Начало выполнения suspend функции")
    delay(1000) // Приостановка на 1 секунду
    println("Выполнение suspend функции завершено")
}

suspend fun main() {
    println("Начало выполнения основной функции")
    suspendFunction() // Вызов suspend функции
    println("Основная функция завершила выполнение")
}