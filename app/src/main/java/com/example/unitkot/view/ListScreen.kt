package com.example.unitkot.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.unitkot.viewmodel.PersonViewModel


@Composable
fun ListScreen(viewModel: PersonViewModel) {
    Column(modifier = Modifier.padding(24.dp)) {
        Text(
            text = "Listado de personas",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (viewModel.personas.isEmpty()) {
            Text("No hay personas registradas")
        } else {
            viewModel.personas.forEach { persona ->
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)) {
                    Text(text = persona.nombre, fontWeight = FontWeight.Bold)
                    Text(text = "RUT: ${persona.rut}")
                    Text(text = "Edad: ${persona.edad}")
                }
                Divider()
            }
        }
    }
}