package fr.hamtec.geckos.navigation.transitions

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.navigation3.scene.Scene
import fr.hamtec.geckos.navigation.Route

/**
 * Transition d'entrée standard
 */
val defaultEnterTransition = fadeIn(
    animationSpec = tween(durationMillis = 500),
    initialAlpha = 0.3f
)

/**
 * Transition de sortie standard
 */
val defaultExitTransition = fadeOut(
    animationSpec = tween(durationMillis = 500),
    targetAlpha = 0.0f
)

/**
 * Transition complète pour push (navigation avant)
 */
val pushTransitionSpec: AnimatedContentTransitionScope<Scene<Route>>.() -> ContentTransform = {
    ContentTransform(
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
    )
}

/**
 * Transition complète pour pop (retour arrière)
 */
val popTransitionSpec: AnimatedContentTransitionScope<Scene<Route>>.() -> ContentTransform = {
    ContentTransform(
        targetContentEnter = defaultEnterTransition,
        initialContentExit = defaultExitTransition
    )
}
