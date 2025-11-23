# Compose MVVM demo

Proyecto de ejemplo en **Kotlin** con **Jetpack Compose** que muestra una navegación básica con `NavController`
y arquitectura **MVVM**. La app incluye:

- Pantalla inicial con dos botones para ir al registro y al listado.
- Pantalla de registro con campos para RUT, nombre y edad.
- Pantalla de listado que muestra todas las personas guardadas en el `ViewModel`.
- `MaterialTheme` aplicado a toda la interfaz.

## Estructura de paquetes

- `model/Person.kt`: modelo de datos.
- `viewmodel/PersonViewModel.kt`: lógica de presentación y estado.
- `navigation/AppNavGraph.kt`: rutas y destinos.
- `ui/`: pantallas composables para inicio, registro y listado.
- `ui/theme/`: theming Material 3.

## Inicio rápido

Integra la carpeta `composeApp` como módulo de aplicación Android
asegúrate de tener las dependencias de Compose, Navigation y Material 3 en tu `build.gradle`.
La actividad principal `MainActivity` invoca `ConsumoApp`, que configura el tema y la gráfica de navegación.

## Librerias

[navigationCompose = "2.9.5"](https://developer.android.com/guide/navigation?hl=es-419)
