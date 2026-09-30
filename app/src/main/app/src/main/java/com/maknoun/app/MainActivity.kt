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
        setContent {
            MaknounApp()
        }
    }
}

@Composable
fun MaknounApp() {
    var text by remember { mutableStateOf("") }
    var messages by remember { mutableStateOf(listOf("مرحبا بك في MAKNOUN 40 🔥")) }
    
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF0A0A0A))
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Header
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                    Text("MAKNOUN", color = Color(0xFFD4AF37), fontSize = 32.sp, fontWeight = FontWeight.Black)
                    Text("VERSION 40.0", color = Color.White, fontSize = 14.sp, letterSpacing = 4.sp)
                    Spacer(modifier = Modifier.height(12.dp))
                    Divider(color = Color(0xFFD4AF37), thickness = 1.dp)
                }

                // Messages
                Column(modifier = Modifier.weight(1f).padding(vertical = 16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    messages.forEach { msg ->
                        Card(
                            shape = RoundedCornerShape(12.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E1E)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(msg, color = Color.White, modifier = Modifier.padding(12.dp))
                        }
                    }
                }

                // Input
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        placeholder = { Text("كتب شي حاجة...", color = Color.Gray) },
                        modifier = Modifier.weight(1f),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedBorderColor = Color(0xFFD4AF37)
                        ),
                        shape = RoundedCornerShape(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {
                            if (text.isNotBlank()) {
                                messages = messages + "أنت: $text"
                                messages = messages + "MAKNOUN 40: فهمتك - $text ✅"
                                text = ""
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD4AF37)),
                        shape = RoundedCornerShape(24.dp)
                    ) {
                        Text("إرسال", color = Color.Black, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
