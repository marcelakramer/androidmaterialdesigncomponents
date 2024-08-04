package com.example.materialdesigncomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                    color = MaterialTheme.colorScheme.background
                ) {
                    FABsExample()
                }
            }
        }
    }
}

@Composable
fun FABsExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FloatingActionButton(
            onClick = {},
            containerColor = Color.Blue,
            contentColor = Color.White
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Add")
        }

        Spacer(modifier = Modifier.height(16.dp))

        SmallFloatingActionButton(
            onClick = {},
            containerColor = Color.Green,
            contentColor = Color.White
        ) {
            Icon(Icons.Filled.Delete, contentDescription = "Delete")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LargeFloatingActionButton(
            onClick = {},
            shape = CircleShape,
            containerColor = Color.Red,
            contentColor = Color.White
        ) {
            Icon(Icons.Filled.Refresh, contentDescription = "Refresh")
        }

        Spacer(modifier = Modifier.height(16.dp))

        ExtendedFloatingActionButton(
            onClick = {},
            icon = { Icon(Icons.Filled.Edit, contentDescription = "Edit") },
            text = { Text("Edit", fontSize = 16.sp, fontWeight = FontWeight.Bold) },
            containerColor = Color.Magenta,
            contentColor = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FABsPreview() {
    MaterialDesignComponentsTheme {
        FABsExample()
    }
}