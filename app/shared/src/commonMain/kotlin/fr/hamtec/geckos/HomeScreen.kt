package fr.hamtec.geckos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Bonjour Hamid, UI multiplateforme !")
        Button(onClick = {}) { Text("Clique-moi") }
    }
}
