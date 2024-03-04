package lab3

fun main(){
    println("Введите число:")
    val input = readln()
    var evenCounter = 0
    var oddCounter = 0
    for (char in input){
        if (char.toString().toInt() % 2 == 0) evenCounter++ else oddCounter++
    }
    println("В числе $evenCounter четных(-ые) цифр(-ы), и $oddCounter нечетных(-ые).")
}
