package fr.hamtec.geckos.navigation

sealed class Screen {
    data object Home : Screen()
    data object Details : Screen()
}
