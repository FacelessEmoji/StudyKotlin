package lab2

fun main(){
    val age = readLine()?.toInt()

    if (age != null) {
        when {
            age > 18 -> println("Вам уже все можно")
            age == 18 -> println("Ура, Вам 18 лет!")
            else -> println("Вы еще слишком молоды")
        }
    }
}


