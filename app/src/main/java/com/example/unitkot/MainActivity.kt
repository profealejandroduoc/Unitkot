package com.example.unitkot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.unitkot.navigation.AppNavGraph
import com.example.unitkot.ui.theme.UnitkotTheme
import com.example.unitkot.viewmodel.PersonViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConsumoApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConsumoApp(personViewModel: PersonViewModel = viewModel()) {
    val navController = rememberNavController()

    UnitkotTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            AppNavGraph(
                navController = navController,
                personViewModel = personViewModel
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConsumoAppPreview() {
    ConsumoApp()
}