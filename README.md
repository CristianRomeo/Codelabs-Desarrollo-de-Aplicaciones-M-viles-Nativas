# Codelab 1: Mi Primera App en Android (Happy Birthday)

Este proyecto es el resultado del primer codelab del curso de Android Basics con Compose. El objetivo era crear una aplicación de tarjeta de felicitación de cumpleaños muy simple.

La aplicación consta de una sola pantalla que muestra un mensaje de "¡Feliz cumpleaños!" y una firma, con un formato y alineación específicos.

## Aspectos Interesantes del Ejercicio

Siguiendo la pauta del ejercicio, aquí están los aspectos que me parecieron más interesantes y los conceptos clave aprendidos:

* **Introducción a Jetpack Compose:** Este fue el primer contacto real con el framework de UI declarativo de Android. Es un cambio de paradigma frente al antiguo sistema de Vistas basado en XML. La UI se describe como una función de los datos (en este caso, texto estático).

* **Funciones `@Composable`:** Comprendimos que la UI se construye anidando pequeñas funciones marcadas con la anotación `@Composable`. En este ejercicio, creamos nuestra propia función `GreetingText()` y utilizamos la que viene por defecto, `Text()`.

* **El poder del `@Preview`:** La anotación `@Preview` es increíblemente útil. Permite ver los cambios de la UI en tiempo real directamente en el editor de Android Studio, sin necesidad de compilar y ejecutar la app en un emulador o dispositivo. Esto acelera el ciclo de desarrollo de forma masiva.

* **Layouts y `Modifiers`:**
    * Aprendimos a usar el Composable `Column` para organizar elementos de forma vertical (el saludo encima de la firma).
    * Descubrimos los **Modifiers** (`Modifier`) como la herramienta principal para decorar o modificar los Composables. Usamos `Modifier.padding()` para añadir espacio, `Modifier.fillMaxSize()` para que la columna ocupe toda la pantalla, y `Modifier.align()` para alinear la firma a la derecha.

* **Estilo de Texto:** Vimos qué fácil es aplicar estilo al texto, como el tamaño de la fuente (`fontSize`), la altura de línea (`lineHeight`) y la alineación del texto (`textAlign`).

## Tecnologías Utilizadas

* Android Studio
* Kotlin
* Jetpack Compose
