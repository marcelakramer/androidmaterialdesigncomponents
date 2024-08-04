package com.example.materialdesigncomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.materialdesigncomponents.ui.theme.MaterialDesignComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialDesignComponentsTheme {
                FullExample()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FullExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Jetpack Compose", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu", tint = Color.White)
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF7644C7))
            )
        },
        floatingActionButton = {
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxHeight()
            ) {
                SmallFloatingActionButton(
                    onClick = {},
                    containerColor = Color(0xFF1DC493),
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 8.dp)
                ) {
                    Icon(painterResource(R.drawable.target), contentDescription = "Compass", tint = Color.White)
                }
                ExtendedFloatingActionButton(
                    onClick = {},
                    containerColor = Color(0xFF1DC493),
                    icon = { Icon(painterResource(R.drawable.navigation_variant), contentDescription = "Edit", tint = Color.White) },
                    text = { Text("Navigate", fontSize = 16.sp, color = Color.White) },
                )
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.height(72.dp),
                contentPadding = PaddingValues(horizontal = 8.dp),
                containerColor = Color(0xFF7644C7),
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            TextButton(
                                onClick = {},
                                modifier = Modifier.size(30.dp),
                                contentPadding = PaddingValues(0.dp)
                            ) {
                                Icon(Icons.Filled.Home, contentDescription = "Home", modifier = Modifier.size(24.dp), tint = Color.Black)
                            }
                            Text("Home", fontSize = 12.sp, color = Color.Black)
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            TextButton(
                                onClick = {},
                                modifier = Modifier.size(30.dp),
                                contentPadding = PaddingValues(0.dp)
                            ) {
                                Icon(Icons.Filled.AddCircle, contentDescription = "Create", modifier = Modifier.size(24.dp), tint = Color.Black)
                            }
                            Text("Create", fontSize = 12.sp, color = Color.Black)
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            TextButton(
                                onClick = {},
                                modifier = Modifier.size(30.dp),
                                contentPadding = PaddingValues(0.dp)
                            ) {
                                Icon(Icons.Filled.Settings, contentDescription = "Settings", modifier = Modifier.size(24.dp), tint = Color.Black)
                            }
                            Text("Settings", fontSize = 12.sp, color = Color.Black)
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        val itemsList = List(50) { "List item - $it" }

        LazyColumn(
            contentPadding = innerPadding,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(itemsList) { item ->
                Text(text = item, modifier = Modifier.padding(vertical = 24.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FullExamplePreview() {
    MaterialDesignComponentsTheme {
        FullExample()
    }
}
