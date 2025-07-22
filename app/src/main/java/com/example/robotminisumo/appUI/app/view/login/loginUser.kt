import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

fun loginUser(email: String, password: String, onResult: (Boolean) -> Unit) {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val url = URL("http://172.20.4.36/robotminisumo/login.php") //internet UCAD Alumnos
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "POST"
            connection.doOutput = true
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            val postData = "email=${URLEncoder.encode(email, "UTF-8")}&password=${URLEncoder.encode(password, "UTF-8")}"
            connection.outputStream.use {
                it.write(postData.toByteArray())
            }
            val response = connection.inputStream.bufferedReader().readText().trim()
            withContext(Dispatchers.Main) {
                onResult(response == "ok")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            withContext(Dispatchers.Main) {
                onResult(false)
            }
        }
    }
}
