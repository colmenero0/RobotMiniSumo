package com.example.robotminisumo.appUI.app.view.login

import java.net.HttpURLConnection
import java.net.URL

fun loginUser(email: String, password: String, onResult: (Boolean) -> Unit) {
    Thread {
        try {
            val url = URL("http://10.0.2.2/robotminisumo/login.php")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "POST"
            connection.doOutput = true
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")

            val postData = "username=$email&password=$password"
            connection.outputStream.use {
                it.write(postData.toByteArray())
            }

            val response = connection.inputStream.bufferedReader().readText().trim()
            onResult(response == "ok")
        } catch (e: Exception) {
            e.printStackTrace()
            onResult(false)
        }
    }.start()
}
