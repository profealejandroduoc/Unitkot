package com.example.unitkot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.unitkot.view.HomeScreen
import com.example.unitkot.view.ListScreen
import com.example.unitkot.view.RegisterScreen

import com.example.unitkot.viewmodel.PersonViewModel

sealed class Destinos(val ruta: String) {
    data object Home : Destinos("home")
    data object Registro : Destinos("registro")
    data object Listado : Destinos("listado")
}

@Composable
fun AppNavGraph(navController: NavHostController, personViewModel: PersonViewModel) {
    NavHost(navController = navController, startDestination = Destinos.Home.ruta) {
        composable(Destinos.Home.ruta) {
            HomeScreen(
                irARegistro = { navController.navigate(Destinos.Registro.ruta) },
                irAListado = { navController.navigate(Destinos.Listado.ruta) }
            )
        }
        composable(Destinos.Registro.ruta) {
            RegisterScreen(
                viewModel = personViewModel,
                onRegistroExitoso = { navController.navigate(Destinos.Listado.ruta) }
            )
        }
        composable(Destinos.Listado.ruta) {
            ListScreen(viewModel = personViewModel)
        }
    }
}