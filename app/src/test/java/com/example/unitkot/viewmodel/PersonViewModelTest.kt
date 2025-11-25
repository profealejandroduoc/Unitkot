package com.example.unitkot.viewmodel

import com.example.unikot.model.Persona
import org.junit.Assert.*
import org.junit.Test

class PersonViewModelTest {
    @Test
    fun getRut() {
    }

    @Test
    fun getNombre() {
    }

    @Test
    fun getEdad() {
    }

    @Test
    fun getPersonas() {
    }

    @Test
    fun onRutChange() {
    }

    @Test
    fun onNombreChange() {
    }

    @Test
    fun onEdadChange() {
    }

    @Test
    fun registrarPersona() {
    }


    @Test
    fun `onRutChange should update rut`() {
        // Given
        val viewModel = PersonViewModel()
        val newRut = "12345678-9"

        // When
        viewModel.onRutChange(newRut)

        // Then
        assertEquals("12345678-9", viewModel.rut)
    }

    @Test
    fun `onRutChange with empty string`() {
        // Given the rut has a value
        // When onRutChange is called with an empty string
        // Then the rut property should be updated to an empty string.
        // TODO implement test
    }

    @Test
    fun `onRutChange with special characters`() {
        // Given an initial state
        // When onRutChange is called with a string containing special characters
        // Then the rut property should be updated to that string, as there's no validation.
        // TODO implement test
    }

    @Test
    fun `onNombreChange should update nombre`() {
        // Given an initial state
        // When onNombreChange is called with a new value
        // Then the nombre property should be updated to the new value.
        // TODO implement test
    }

    @Test
    fun `onNombreChange with empty string`() {
        // Given the nombre has a value
        // When onNombreChange is called with an empty string
        // Then the nombre property should be updated to an empty string.
        // TODO implement test
    }

    @Test
    fun `onNombreChange with numbers and special characters`() {
        // Given an initial state
        // When onNombreChange is called with a string containing numbers and special characters
        // Then the nombre property should be updated to that string.
        // TODO implement test
    }

    @Test
    fun `onEdadChange should update edad with only digits`() {
        // Given an initial state
        // When onEdadChange is called with a string containing digits
        // Then the edad property should be updated with that string of digits.
        // TODO implement test
    }

    @Test
    fun `onEdadChange should filter out non digit characters`() {
        // Given an initial state
        // When onEdadChange is called with an alphanumeric string (e.g., '25a')
        // Then the edad property should only contain the digits ('25').
        // TODO implement test
    }

    @Test
    fun `onEdadChange with string containing only letters`() {
        // Given an initial state
        // When onEdadChange is called with a string containing only letters
        // Then the edad property should be updated to an empty string.
        // TODO implement test
    }

    @Test
    fun `onEdadChange with empty string`() {
        // Given the edad has a value
        // When onEdadChange is called with an empty string
        // Then the edad property should be updated to an empty string.
        // TODO implement test
    }

    @Test
    fun `registrarPersona with valid data should succeed`() {
        // Given all properties (rut, nombre, edad) are populated with valid, non-blank data
        // When registrarPersona is called
        // Then it should return true.
        // TODO implement test
    }

    @Test
    fun `registrarPersona successful registration should add a person to the list`() {
        // Given
        val viewModel = PersonViewModel()
        val rut = "12345678-9"
        val nombre = "John Doe"
        val edad = "30"
        viewModel.onRutChange(rut)
        viewModel.onNombreChange(nombre)
        viewModel.onEdadChange(edad)

        // When
        val success = viewModel.registrarPersona()

        // Then
        assertTrue(success)
        assertEquals(1, viewModel.personas.size)
        val newPersona = viewModel.personas.first()
        assertEquals(rut, newPersona.rut)
        assertEquals(nombre, newPersona.nombre)
        assertEquals(edad.toInt(), newPersona.edad)
    }

    @Test
    fun `registrarPersona successful registration should clear the fields`() {
        // Given all properties are valid
        // When registrarPersona is called and returns true
        // Then rut, nombre, and edad properties should be reset to empty strings.
        // TODO implement test
    }

    @Test
    fun `registrarPersona with empty rut should fail`() {
        // Given rut is blank, but nombre and edad are not
        // When registrarPersona is called
        // Then it should return false and the personas list should not change.
        // TODO implement test
    }

    @Test
    fun `registrarPersona with empty nombre should fail`() {
        // Given nombre is blank, but rut and edad are not
        // When registrarPersona is called
        // Then it should return false and the personas list should not change.
        // TODO implement test
    }

    @Test
    fun `registrarPersona with empty edad should fail`() {
        // Given edad is blank, but rut and nombre are not
        // When registrarPersona is called
        // Then it should return false and the personas list should not change.
        // TODO implement test
    }

    @Test
    fun `registrarPersona with all fields empty should fail`() {
        // Given all properties (rut, nombre, edad) are blank
        // When registrarPersona is called
        // Then it should return false and the personas list should remain empty.
        // TODO implement test
    }

    @Test
    fun `registrarPersona failure should not clear fields`() {
        // Given one or more properties are blank (e.g., rut is empty)
        // When registrarPersona is called and returns false
        // Then rut, nombre, and edad properties should retain their values.
        // TODO implement test
    }

    @Test
    fun `registrarPersona multiple registrations`() {
        // Given a successful registration has occurred
        // When a second registration is performed with new valid data
        // Then the personas list should contain two Persona objects.
        // TODO implement test
    }
}