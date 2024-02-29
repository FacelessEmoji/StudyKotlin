package lab2

fun main(){
    println("У вас есть числа: 2 и 6\n 1. Добавить\n 2. Отнять\n 0. Ничего\n")
    val action = readln().toInt()
    val two = 2
    val six = 6
    if (action==1){
        println(two+six)
    }else if (action==2){
        println(two-six)
    }
}
