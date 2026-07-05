package fr.hamtec.geckos

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.geckos.services.getDeviceInfoService
import fr.hamtec.geckos.services.getFileSystemService
import org.jetbrains.compose.resources.painterResource

import geckos.app.shared.generated.resources.Res
import geckos.app.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val deviceInfo = remember { getDeviceInfoService() }
        val fs = remember { getFileSystemService() }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Clique ici !")
            }
            Text("OS: ${deviceInfo.osName}")
            Text("Version: ${deviceInfo.osVersion}")
            Text("Manufacturer: ${deviceInfo.manufacturer}")
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
            Button(onClick = {
                fs.writeText("demo.txt", "Bonjour Hamid !")
            }) {
                Text("Écrire fichier")
            }

            Button(onClick = {
                println(fs.readText("demo.txt"))
            }) {
                Text("Lire fichier")
            }

            val files = fs.listFiles(".")
            Text("Fichiers: ${files.joinToString()}")
        }
    }
}