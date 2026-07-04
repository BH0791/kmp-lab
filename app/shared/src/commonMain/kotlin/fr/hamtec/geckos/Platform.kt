package fr.hamtec.geckos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform