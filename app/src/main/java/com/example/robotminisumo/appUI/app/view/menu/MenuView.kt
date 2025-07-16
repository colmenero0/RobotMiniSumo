package com.example.robotminisumo.appUI.app.view.menu

import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bluetooth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.robotminisumo.R
import com.example.robotminisumo.appUI.navigation.AppsView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuView(
    navController: NavController? = null,
    onAutonomousClick: () -> Unit = {},
    onManualClick: () -> Unit = {}
) {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondo_menu),
            contentDescription = "Fondo del menú",
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
                            navController?.navigate(AppsView.LoginView.name)
                        }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Volver",
                                tint = Color.White
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {
                            val intent = Intent(Settings.ACTION_BLUETOOTH_SETTINGS)
                            context.startActivity(intent)
                        }) {
                            Icon(
                                imageVector = Icons.Default.Bluetooth,
                                contentDescription = "Bluetooth",
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
                    .padding(paddingValues)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                        .padding(horizontal = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Spacer(modifier = Modifier.height(100.dp))
                    Button(
                        onClick = { navController?.navigate(AppsView.AutonomoView.name) },
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Text("Modo Autónomo", color = Color.Black)
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Button(
                        onClick = { navController?.navigate(AppsView.ManualView.name) },
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Text("Modo Manual", color = Color.Black)
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
@Composable
fun MenuViewPreview() {
    MenuView()
}