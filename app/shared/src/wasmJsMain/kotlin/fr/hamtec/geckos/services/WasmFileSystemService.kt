package fr.hamtec.geckos.services

/**
 * In-memory FS
 * Parfait pour WASM
 */
class WasmFileSystemService : FileSystemService {

    private val memoryFs = mutableMapOf<String, String>()

    override fun readText(path: String): String? =
        memoryFs[path]

    override fun writeText(path: String, content: String) {
        memoryFs[path] = content
    }

    override fun listFiles(path: String): List<String> =
        memoryFs.keys.toList()
}

actual fun getFileSystemService(): FileSystemService =
    WasmFileSystemService()
