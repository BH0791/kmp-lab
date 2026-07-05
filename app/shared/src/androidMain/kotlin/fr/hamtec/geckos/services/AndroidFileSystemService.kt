package fr.hamtec.geckos.services

import android.content.Context
import java.io.File

/**
 * Utilise context.filesDir
 * Nécessite d’injecter le Context depuis MainActivity
 * C’est la version la plus réaliste pour Android
 */
class AndroidFileSystemService(private val context: Context) : FileSystemService {

    override fun readText(path: String): String? =
        File(context.filesDir, path).takeIf { it.exists() }?.readText()

    override fun writeText(path: String, content: String) {
        File(context.filesDir, path).writeText(content)
    }

    override fun listFiles(path: String): List<String> =
        File(context.filesDir, path).list()?.toList() ?: emptyList()
}

lateinit var androidContext: Context

actual fun getFileSystemService(): FileSystemService =
    AndroidFileSystemService(androidContext)
