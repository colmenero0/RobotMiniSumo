package com.example.robotminisumo.appUI.app.view.autonomo

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.robotminisumo.appUI.app.view.manual.ManualView

@Composable
fun AutonomoView(
    navController: NavController? = null,
    onRoutine1Click: () -> Unit = {},
    onRoutine2Click: () -> Unit = {},
    onRoutine3Click: () -> Unit = {}
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.fillMaxWidth(0.6f)
            ) {
                Button(
                    onClick = onRoutine1Click,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text("Rutina 1")
                }
                Button(
                    onClick = onRoutine2Click,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text("Rutina 2")
                }
                Button(
                    onClick = onRoutine3Click,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text("Rutina 3")
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
@Composable
fun AutonomoViewPreview() {
    AutonomoView(
        navController = null,
    )
}