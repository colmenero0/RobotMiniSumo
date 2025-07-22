package com.example.robotminisumo.appUI.app.view.register

import java.net.HttpURLConnection
import java.net.URL

fun sendRegisterData(name: String, email: String, password: String, onResult: (String) -> Unit) {
    Thread {
        try {
            val url = URL("http://172.20.4.36/robotminisumo/register.php") //internet UCAD Alumnos
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "POST"
            connection.doOutput = true
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            val postData = "name=$name&email=$email&password=$password"
            connection.outputStream.use {
                it.write(postData.toByteArray())
            }
            val response = connection.inputStream.bufferedReader().readText().trim()
            onResult(
                when (response) {
                    "ok" -> "Registro exitoso"
                    "duplicado" -> "El correo ya está registrado"
                    else -> "Error en el registro"
                }
            )
        }catch (e: Exception) {
            e.printStackTrace()
            onResult("Error de conexión: ${e.message}")
        }

    }.start()
}
