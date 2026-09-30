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
            MaterialTheme {
                var number by remember { mutableStateOf("") }
                var result by remember { mutableStateOf("") }
                
                Column(
                    modifier = Modifier.fillMaxSize().background(Color(0xFF0F0F0F)).padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("MAKNOUN 40", color = Color(0xFFFFD700), fontSize = 32.sp, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(20.dp))
                    TextField(value = number, onValueChange = { number = it }, label = { Text("رقم اللوتو") }, modifier = Modifier.fillMaxWidth())
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = { result = "✅ تحليل MAKNOUN 40: $number" }, modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(Color(0xFFFFD700))) {
                        Text("حلل بـ MAKNOUN 40", color = Color.Black)
                    }
                    Spacer(Modifier.height(20.dp))
                    if(result.isNotEmpty()) {
                        Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = CardDefaults.cardColors(Color(0xFF1E1E1E))) {
                            Text(result, modifier = Modifier.padding(16.dp), color = Color.White)
                        }
                    }
                }
            }
        }
    }
}
