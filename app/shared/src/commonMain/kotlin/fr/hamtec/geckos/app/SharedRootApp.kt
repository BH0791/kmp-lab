package fr.hamtec.geckos.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import fr.hamtec.geckos.navigation.AppNavigation

/**
 * 🎯 1. Tu as un point d’entrée UI multiplateforme propre
 */
@Composable
fun SharedRootApp() {
    MaterialTheme {
        AppNavigation()
    }
}
