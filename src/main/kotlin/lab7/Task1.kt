import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

fun printTime() {
    val job = GlobalScope.launch {
        while (true) {
            val currentTime = SimpleDateFormat("HH:mm:ss").format(Date())
            println("Текущее время: $currentTime")
            delay(1000)
        }
    }
    Thread.sleep(10000)
    job.cancel()
}
