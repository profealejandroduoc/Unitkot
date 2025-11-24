package com.example.unitkot.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.unitkot.viewmodel.PersonViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(
    viewModel: PersonViewModel,
    onRegistroExitoso: () -> Unit,
    onNavigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Registrar persona") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues).padding(24.dp)) {
            OutlinedTextField(
                value = viewModel.rut,
                onValueChange = viewModel::onRutChange,
                label = { Text("RUT") },
                modifier = Modifier.fillMaxWidth(),
//                isError = viewModel.rutError != null,
//                supportingText = { viewModel.rutError?.let { Text(it) } }
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = viewModel.nombre,
                onValueChange = viewModel::onNombreChange,
                label = { Text("Nombre") },
                modifier = Modifier.fillMaxWidth(),
//                isError = viewModel.nombreError != null,
//                supportingText = { viewModel.nombreError?.let { Text(it) } }
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = viewModel.edad,
                onValueChange = viewModel::onEdadChange,
                label = { Text("Edad") },
                modifier = Modifier.fillMaxWidth(),
//                isError = viewModel.edadError != null,
//                supportingText = { viewModel.edadError?.let { Text(it) } }
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(onClick = {
                if (viewModel.registrarPersona()) {
                    onRegistroExitoso()
                }
            }) {
                Text(text = "Guardar")
            }
        }
    }
}