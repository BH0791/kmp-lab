package fr.hamtec.geckos.navigation.display

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import fr.hamtec.geckos.navigation.Route
import fr.hamtec.geckos.navigation.backstack.BackStack
import fr.hamtec.geckos.navigation.screens.HomeScreen
import fr.hamtec.geckos.navigation.screens.ProductScreen
import fr.hamtec.geckos.navigation.screens.SettingsScreen
import fr.hamtec.geckos.navigation.transitions.popTransitionSpec
import fr.hamtec.geckos.navigation.transitions.pushTransitionSpec


@Composable
fun NavigationDisplay() {

    // BackStack typé, contenant une SnapshotStateList
    val backStack = remember { BackStack() }

    NavDisplay(
        backStack = backStack.stack,   // ⬅ On donne la vraie liste mutable
        onBack = { backStack.pop() },

        transitionSpec = pushTransitionSpec,
        popTransitionSpec = popTransitionSpec,

        entryProvider = entryProvider {

            // Écran Home
            entry<Route.Home> {
                HomeScreen(
                    onNavigateToSettings = {
                        backStack.push(Route.Settings("147"))
                    },
                    onNavigateToProduct = { id ->
                        backStack.push(Route.Product(id))
                    }
                )
            }

            // Écran Product
            entry<Route.Product> { product ->
                ProductScreen(
                    product = product,
                    onBack = { backStack.pop() }
                )
            }
            // Écran Settings
            entry<Route.Settings> { settings ->
                SettingsScreen(
                    settings = settings,
                    onBack = { backStack.pop() }
                )
            }
        }
    )
}