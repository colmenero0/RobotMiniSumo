package com.example.robotminisumo.appUI.app.view.menu

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuView(
    navController: NavController? = null,
    onAutonomousClick: () -> Unit = {},
    onManualClick: () -> Unit = {},
    onBluetoothClick: () -> Unit = {}
) {
    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { /* Puedes poner título aquí si quieres */ },
//                navigationIcon = {
//                    TextButton(onClick = onBluetoothClick) {
//                        Text("Bluetooth", style = typography.bodyLarge)
//                    }
//                },
//                colors = TopAppBarDefaults.smallTopAppBarColors()
//            )
//        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Button(
                    onClick = onAutonomousClick,
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp)
                ) {
                    Text("Modo Autónomo")
                }

                Button(
                    onClick = onManualClick,
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp)
                ) {
                    Text("Modo Manual")
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
@Composable
fun MenuViewPreview() {
    MenuView(
        navController = null,
    )
}
