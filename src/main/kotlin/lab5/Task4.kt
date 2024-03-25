package lab5

fun countWords(input: String): Int {
    val regex = Regex("\\s+|[,;.]+")
    val words = input.split(regex).filter { it.isNotEmpty() }
    return words.size
}

fun main() {
    val inputString = "Это строка, которую мы будем анализировать; ,.  ;.и ,,подсчитывать количество слов в ней." //12
    val wordCount = countWords(inputString)
    println("Количество слов в строке: $wordCount")
}
