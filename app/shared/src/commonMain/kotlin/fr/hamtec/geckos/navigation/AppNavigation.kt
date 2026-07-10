package fr.hamtec.geckos.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import fr.hamtec.geckos.ui.DetailsScreen
import fr.hamtec.geckos.ui.HomeScreen

@Composable
fun AppNavigation() {
    var current by remember { mutableStateOf<Screen>(Screen.Home) }

    when (current) {
        Screen.Home -> HomeScreen(onNavigate = { current = Screen.Details })
        Screen.Details -> DetailsScreen()
    }
}
