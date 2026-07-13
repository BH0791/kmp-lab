package fr.hamtec.geckos.navigation

import androidx.compose.animation.ContentTransform
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay

// [START android_compose_navigation3_basic_4]
data object Home
data class Product(val id: String)

@Composable
fun NavExample() {
    val backStack = remember { mutableStateListOf<Any>(Home) }
    val enter = fadeIn(
        animationSpec = tween(durationMillis = 500),
        initialAlpha = 0.3f
    )

    val exit = fadeOut(
        animationSpec = tween(durationMillis = 500),
        targetAlpha = 0.0f
    )

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        transitionSpec = { ContentTransform(
            targetContentEnter = fadeIn(
                animationSpec = tween(durationMillis = 500),
                initialAlpha = 0.3f
            ),
            initialContentExit = fadeOut(
                animationSpec = tween(durationMillis = 500),
                targetAlpha = 0.0f
            ),
            sizeTransform = SizeTransform(
                clip = false,
                sizeAnimationSpec = { _, _ -> tween(durationMillis = 500) }
            )

        ) },
        popTransitionSpec = { ContentTransform(
            targetContentEnter = enter,
            initialContentExit = exit
        ) },
        entryProvider = entryProvider {
            entry<Home> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp)
                        .background(Color.Cyan),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("🏠 Accueil", style = MaterialTheme.typography.headlineMedium)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        backStack.add(Product("123"))
                    }) {
                        Text("Voir produit")
                    }
                }
            }
            entry<Product> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp)
                        .background(Color.Green),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("📦 Produit ${it.id}", style = MaterialTheme.typography.headlineMedium)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        backStack.removeLastOrNull()
                    }) {
                        Text("Retour")
                    }
                }
            }
        }
    )
}
