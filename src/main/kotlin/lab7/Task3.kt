package lab7

import kotlinx.coroutines.*
import kotlin.random.Random

suspend fun performTask(coroutineIndex: Int): Pair<Int, String> {
    val randomNumber = Random.nextInt(100)
    val result = if (randomNumber % 2 == 0) "Четное" else "Нечетное"
    return Pair(coroutineIndex, result)
}

fun main() = runBlocking<Unit> {
    val results = mutableMapOf<Int, String>()

    val jobs = List(100000) {
        launch {
            val (index, result) = performTask(it)
            results[index] = result
        }
    }

    jobs.forEach { it.join() }

    println("Результаты выполнения задач:")
    results.forEach { (index, result) ->
        println("Корутина $index: $result")
    }
}
