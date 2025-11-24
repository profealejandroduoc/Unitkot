package com.example.unitkot.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.unikot.model.Persona

class PersonViewModel : ViewModel() {
    var rut by mutableStateOf("")
        private set
    var nombre by mutableStateOf("")
        private set
    var edad by mutableStateOf("")
        private set
    var personas by mutableStateOf(listOf<Persona>())
        private set

    fun onRutChange(value: String) {
        rut = value
    }

    fun onNombreChange(value: String) {
        nombre = value
    }

    fun onEdadChange(value: String) {
        edad = value.filter { it.isDigit() }
    }

//    fun registrarPersona() {
//        val edadInt = edad.toIntOrNull() ?: return
//        val nuevaPersona = Persona(rut = rut, nombre = nombre, edad = edadInt)
//        personas = personas + nuevaPersona
//        limpiarCampos()
//
//    }
    // In your PersonViewModel.kt file

    fun registrarPersona(): Boolean {
        // Add your validation logic here.
        // For example, check if the fields are not empty.
        if (rut.isNotBlank() && nombre.isNotBlank() && edad.isNotBlank()) {
            // Here you would typically save the data to a database or repository.
            // If the operation is successful:
            return true
        } else {
            // If validation fails or the operation is unsuccessful:
            // You might want to set error states here for the UI.
            // For example: if (rut.isBlank()) rutError = "RUT cannot be empty"
            return false
        }
    }


    private fun limpiarCampos() {
        rut = ""
        nombre = ""
        edad = ""
    }
}