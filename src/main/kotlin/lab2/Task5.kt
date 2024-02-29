package lab2

fun main(){
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    //100 100 90 - нет среднего
    if ((a==b && a==c) || (a==b) || (a==c)|| (b==c)){
        println("Ошибка")
    } else if (a in (b + 1) until c || a in (c + 1) until b){
        println(a)
    } else if (b in (a + 1) until c || b in (c + 1) until a){
        println(b)
    } else println(c)
}