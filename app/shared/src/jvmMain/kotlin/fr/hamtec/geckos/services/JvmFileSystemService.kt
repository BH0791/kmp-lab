package fr.hamtec.geckos.services

import java.io.File

/**
 * Utilise java.io.File
 * Fonctionne pour DesktopApp et Server
 */
class JvmFileSystemService : FileSystemService {

    override fun readText(path: String): String? =
        File(path).takeIf { it.exists() }?.readText()

    override fun writeText(path: String, content: String) {
        File(path).writeText(content)
    }

    override fun listFiles(path: String): List<String> =
        File(path).list()?.toList() ?: emptyList()
}

actual fun getFileSystemService(): FileSystemService =
    JvmFileSystemService()
