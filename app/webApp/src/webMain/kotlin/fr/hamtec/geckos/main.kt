package fr.hamtec.geckos

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import fr.hamtec.geckos.app.SharedRootApp

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        SharedRootApp()
    }
}