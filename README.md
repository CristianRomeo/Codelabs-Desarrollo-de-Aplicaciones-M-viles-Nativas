# Codelab 1: Mi Primera App en Android

Es una aplicación "Tarjeta de Felicitación" (Greeting Card) muy simple, diseñada para introducir los conceptos fundamentales del desarrollo de UI moderno en Android.

## Aspectos Interesantes del Ejercicio
Este primer codelab fue una introducción práctica a Jetpack Compose. Los puntos más destacados que se aprendieron fueron:

**Funciones `@Composable`:**
El núcleo de Compose son las funciones anotadas con @Composable. Aprendimos que:
Son las "piezas de construcción" de la UI (como Greeting()). Deben tener la primera letra en mayúscula (por convención). Se pueden llamar desde otras funciones @Composable.

**El poder del `@Preview`:**
Esta es una de las herramientas más potentes para el desarrollo de UI. Al anotar una función Composable (como GreetingPreview()) con @Preview, podemos ver cómo se renderiza ese componente directamente en el panel de diseño de Android Studio.

Esto acelera enormemente el ciclo de desarrollo, ya que no es necesario compilar y ejecutar la aplicación completa en un emulador o dispositivo físico para ver cada pequeño cambio visual.

**Layouts y `Modifiers`:**
Descubrimos los **Modifiers** (`Modifier`) como la herramienta principal para decorar o modificar los Composables. Usamos `Modifier.padding()` para añadir espacio, `Modifier.fillMaxSize()` para que la columna ocupe toda la pantalla, y `Modifier.align()` para alinear la firma a la derecha.

**Estilo de Texto:**
Vimos qué fácil es aplicar estilo al texto, como el tamaño de la fuente (`fontSize`), la altura de línea (`lineHeight`) y la alineación del texto (`textAlign`).

## Tecnologías Utilizadas

* Android Studio
* Kotlin
* Jetpack Compose
