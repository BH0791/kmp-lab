package fr.hamtec.geckos.navigation.backstack

import androidx.compose.runtime.mutableStateListOf
import fr.hamtec.geckos.navigation.Route

/**
 * BackStack typé pour Navigation3
 */
class BackStack {

    val stack = mutableStateListOf<Route>(Route.Home)

    fun push(route: Route) = stack.add(route)
    fun pop() = stack.removeLastOrNull()
}
