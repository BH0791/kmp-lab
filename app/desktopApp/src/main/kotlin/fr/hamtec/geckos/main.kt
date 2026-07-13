package fr.hamtec.geckos

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import fr.hamtec.geckos.app.SharedRootApp
import fr.hamtec.geckos.navigation.display.NavigationDisplay

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Geckos",
    ) {
        NavigationDisplay()
    }
}