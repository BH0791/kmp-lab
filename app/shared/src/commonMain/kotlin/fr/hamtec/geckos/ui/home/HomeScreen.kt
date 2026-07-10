package fr.hamtec.geckos.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onNavigate: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Bonjour Hamid, UI multiplateforme !")
        Button(onClick = onNavigate) {
            Text("Aller aux détails")
        }
    }
}
