package fr.hamtec.geckos

/**
 * Ici tu définis :
 *
 * une interface multiplateforme
 * une fonction expect qui doit être implémentée par chaque plateforme
 */
interface Platform {
    val name: String
}

expect fun getPlatform(): Platform