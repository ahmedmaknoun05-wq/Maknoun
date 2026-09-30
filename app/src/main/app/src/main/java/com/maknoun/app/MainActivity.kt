package com.maknoun.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaknounApp() }
    }
}
@Composable
fun MaknounApp() {
    var text by remember { mutableStateOf("") }
    var messages by remember { mutableStateOf(listOf("مرحبا بك في MAKNOUN 40 🔥\nتطبيقك خدام دابا")) }
    MaterialTheme {
        Box(Modifier.fillMaxSize().background(Color(0xFF0A0A0A)).padding(16.dp)) {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    Text("MAKNOUN", color = Color(0xFFD4AF37), fontSize = 32.sp, fontWeight = FontWeight.Black)
                    Text("VERSION 40.0
