package com.example.unitkot.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.consumo.model.Persona

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

    fun registrarPersona() {
        val edadInt = edad.toIntOrNull() ?: return
        val nuevaPersona = Persona(rut = rut, nombre = nombre, edad = edadInt)
        personas = personas + nuevaPersona
        limpiarCampos()
    }

    private fun limpiarCampos() {
        rut = ""
        nombre = ""
        edad = ""
    }
}