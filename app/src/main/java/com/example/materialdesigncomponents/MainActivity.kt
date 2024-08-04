package com.example.materialdesigncomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialdesigncomponents.ui.theme.MaterialDesignComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialDesignComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFFFFF)
                ) {
                    ButtonsExample()
                }
            }
        }
    }
}

@Composable
fun ButtonsExample() {
    Column(modifier = Modifier.padding(16.dp)) {
        FilledButtonExample { }
        Spacer(modifier = Modifier.height(16.dp))
        FilledTonalButtonExample { }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButtonExample { }
        Spacer(modifier = Modifier.height(16.dp))
        ElevatedButtonExample { }
        Spacer(modifier = Modifier.height(16.dp))
        TextButtonExample { }
    }
}

@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6200EE)
        ),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        Text("Filled", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFFFFFF))
    }
}

@Composable
fun FilledTonalButtonExample(onClick: () -> Unit) {
    FilledTonalButton(
        onClick = onClick,
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFBB86FC)
        ),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        Text("Tonal", fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun OutlinedButtonExample(onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = Color(0xFF6200EE)
        ),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        Text("Outlined", fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ElevatedButtonExample(onClick: () -> Unit) {
    ElevatedButton(
        onClick = onClick,
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF018786)
        ),
        contentPadding = PaddingValues(horizontal = 16.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(24.dp)
    ) {
        Text("Elevated", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFFFFFF))
    }
}

@Composable
fun TextButtonExample(onClick: () -> Unit) {
    TextButton(
        onClick = onClick,
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.textButtonColors(
            contentColor = Color(0xFF6200EE)
        )
    ) {
        Text("Text Button", fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonsExample() {
    ButtonsExample()
}