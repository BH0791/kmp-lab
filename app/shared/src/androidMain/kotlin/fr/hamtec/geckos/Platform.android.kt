package fr.hamtec.geckos

import android.os.Build

/**
 * Ici tu fournis :
 *
 * l’implémentation Android de l’interface Platform
 * l’implémentation Android de la fonction expect
 */
class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()