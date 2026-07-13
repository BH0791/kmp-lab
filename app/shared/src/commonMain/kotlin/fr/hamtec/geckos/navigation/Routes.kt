package fr.hamtec.geckos.navigation

sealed class Route {
    data object Home : Route()
    data class Product(val id: String) : Route()
    data class Settings(val id: String) : Route()
    //data object Settings : Route()
}