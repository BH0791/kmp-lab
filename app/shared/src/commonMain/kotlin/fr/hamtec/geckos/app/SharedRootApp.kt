package fr.hamtec.geckos.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.hamtec.geckos.navigation.display.NavigationDisplay

/**
 * 🎯 1. Tu as un point d’entrée UI multiplateforme propre
 */
@Composable
fun SharedRootApp() {
    MaterialTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
        ) { padding ->
            Box(
                Modifier.padding(padding)
            ) {
                NavigationDisplay()
            }
        }
    }
}
