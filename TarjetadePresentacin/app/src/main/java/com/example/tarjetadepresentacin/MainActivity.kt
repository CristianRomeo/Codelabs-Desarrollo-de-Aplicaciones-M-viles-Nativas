package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4) // Color de fondo verde claro
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween, // Separa las dos partes
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Parte 1: Logo, Nombre y Título (centrado)
        // Usamos un 'weight' para que ocupe el espacio disponible y se centre
        LogoAndTitle(
            fullName = "Jennifer Doe",
            title = "Android Developer Extraordinaire",
            modifier = Modifier.weight(1f) // Ocupa el espacio central
        )

        // Parte 2: Información de Contacto (fijada abajo)
        ContactInfo()
    }
}

@Composable
fun LogoAndTitle(fullName: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier, // Este modificador (con weight) nos ayuda a centrar verticalmente
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo), // Asegúrate de tener 'android_logo.png' en res/drawable
            contentDescription = "Logo de Android",
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042)) // Color de fondo del logo
        )
        Text(
            text = fullName,
            fontSize = 32.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006A3B), // Color de texto verde oscuro
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(bottom = 32.dp), // Un poco de espacio desde el borde inferior
        verticalArrangement = Arrangement.spacedBy(8.dp), // Espacio entre cada fila
        horizontalAlignment = Alignment.Start
    ) {
        ContactRow(
            icon = Icons.Default.Phone,
            text = "+11 (123) 444 555 666"
        )
        ContactRow(
            icon = Icons.Default.Share,
            text = "@AndroidDev"
        )
        ContactRow(
            icon = Icons.Default.Email,
            text = "jen.doe@android.com"
        )
    }
}

@Composable
fun ContactRow(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null, // Descriptivo para accesibilidad si fuera necesario
            tint = Color(0xFF006A3B) // Tinte verde oscuro para el ícono
        )
        Spacer(modifier = Modifier.width(16.dp)) // Separador
        Text(
            text = text,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFD2E8D4)
        ) {
            BusinessCardApp()
        }
    }
}