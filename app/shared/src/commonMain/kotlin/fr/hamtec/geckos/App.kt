package fr.hamtec.geckos

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import fr.hamtec.geckos.navigation.AppNavigation

@Composable
fun SharedRootApp() {
    MaterialTheme {
        AppNavigation()
    }
}
