@file:OptIn(InternalAPI::class)

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.util.*
import io.ktor.util.cio.*
import io.ktor.utils.io.*
import kotlinx.coroutines.*
import java.io.File

suspend fun downloadImage(url: String, directory: String, fileName: String) {
    val client = HttpClient()
    val response: HttpResponse = client.get(url)
    val content: ByteReadChannel = response.content
    val folder = File(directory)
    if (!folder.exists()) {
        folder.mkdirs()
    }
    val file = File(folder, fileName)
    content.copyAndClose(file.writeChannel())
    println("Изображение скачано: $fileName")
    client.close()
}

suspend fun downloadImagesWithModifiedNames(urls: List<String>, directory: String) {
    coroutineScope {
        urls.mapIndexed { index, url ->
            launch {
                downloadImage(url, "$directory/modified", "image_$index.jpg")
            }
        }
    }
}

suspend fun downloadImagesWithOriginalNames(imageInfoList: List<Pair<String, String>>, directory: String) {
    coroutineScope {
        imageInfoList.map { (url, fileName) ->
            launch {
                val modifiedDirectory = File("$directory/original")
                if (!modifiedDirectory.exists()) {
                    modifiedDirectory.mkdirs()
                }
                downloadImage(url, modifiedDirectory.path, fileName)
            }
        }
    }
}

suspend fun main() {
    val imageUrls = mutableListOf<String>()
    repeat(100) {
        imageUrls.add("https://via.placeholder.com/150")
    }

    val directory = "C:\\Programming\\Kotlin\\src\\main\\kotlin\\lab8\\pictures"

    downloadImagesWithModifiedNames(imageUrls, directory)

    val imageInfoList = listOf(
        "https://via.placeholder.com/150" to "my_image.jpg",
        "https://via.placeholder.com/150" to "another_image.jpg"
    )
    downloadImagesWithOriginalNames(imageInfoList, directory)
}
