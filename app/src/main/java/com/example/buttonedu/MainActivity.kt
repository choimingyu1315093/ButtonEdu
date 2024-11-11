package com.example.buttonedu

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonedu.ui.theme.ButtonEduTheme

const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonEduTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BasicTextButton()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicButton(modifier: Modifier = Modifier){
    Button(
        onClick = {},
        modifier = modifier
            .fillMaxWidth()
            .height(42.dp),
        colors = ButtonDefaults.buttonColors(
            Color.Black
        ),
        shape = RoundedCornerShape(0.dp),
        border = BorderStroke(3.dp, Color.Yellow)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
            tint = Color.White
        )
        Text(
            text = "Basic Button"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OutlinedButton(modifier: Modifier = Modifier){
    androidx.compose.material3.OutlinedButton(
        onClick = {},
        modifier = modifier
            .fillMaxWidth()
            .height(42.dp),
    ) {
        Text(
            text = "Outlined Button"
        )
    }
}

@Preview
@Composable
fun BasicTextButton(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        TextButton(
            onClick = {
                Log.d(TAG, "BasicTextButton: TextButton Click")
            },
            modifier = modifier
                .fillMaxWidth()
                .height(42.dp)
        ) {
            Text(
                text = "Text Button"
            )
        }
    }
}