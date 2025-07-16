package com.example.robotminisumo.appUI.app.view.autonomo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.robotminisumo.R
import com.example.robotminisumo.appUI.navigation.AppsView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AutonomoView(
    navController: NavController? = null,
    onRoutine1Click: () -> Unit = {},
    onRoutine2Click: () -> Unit = {},
    onRoutine3Click: () -> Unit = {}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondo_autonomo),
            contentDescription = "Fondo autónomo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Scaffold(
            containerColor = Color.Transparent,
            topBar = {
                TopAppBar(
                    title = {},
                    navigationIcon = {
                        IconButton(onClick = {
                            navController?.navigate(AppsView.MenuView.name)
                        }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Volver",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent)
                )
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                ) {
                    Button(
                        onClick = onRoutine1Click,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Text("Rutina 1", color = Color.Black)
                    }
                    Button(
                        onClick = onRoutine2Click,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Text("Rutina 2", color = Color.Black)
                    }
                    Button(
                        onClick = onRoutine3Click,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Text("Rutina 3", color = Color.Black)
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
@Composable
fun AutonomoViewPreview() {
    AutonomoView()
}