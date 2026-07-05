package fr.hamtec.geckos.services

/**
 * Une interface multiplateforme
 * Une fonction expect
 * Un contrat clair pour toutes les plateformes
 */
interface FileSystemService {
    fun readText(path: String): String?
    fun writeText(path: String, content: String)
    fun listFiles(path: String): List<String>
}

expect fun getFileSystemService(): FileSystemService