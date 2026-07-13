package fr.hamtec.geckos

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import fr.hamtec.geckos.app.SharedRootApp
import fr.hamtec.geckos.navigation.display.NavigationDisplay

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        NavigationDisplay()
    }
}