package lab1

fun main() {
    greeting()
}

fun greeting(){
    print("Введите ваше имя: ")
    val name = readLine()
    print("Введите ваш возраст: ")
    val age = readLine()
    println("Привет, $name!Тебе уже $age")
}
