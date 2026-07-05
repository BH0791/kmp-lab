package fr.hamtec.geckos.services

import kotlinx.browser.window

/**
 * Utilise localStorage
 * Simple, efficace, multiplateforme JS
 */
class JsFileSystemService : FileSystemService {

    override fun readText(path: String): String? =
        window.localStorage.getItem(path)

    override fun writeText(path: String, content: String) {
        window.localStorage.setItem(path, content)
    }

    override fun listFiles(path: String): List<String> =
        (0 until window.localStorage.length)
            .mapNotNull { window.localStorage.key(it) }
}

actual fun getFileSystemService(): FileSystemService =
    JsFileSystemService()
