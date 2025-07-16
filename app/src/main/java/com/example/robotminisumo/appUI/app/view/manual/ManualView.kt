package com.example.robotminisumo.appUI.app.view.manual

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
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

@Composable
fun ManualView(
    navController: NavController?,
    onUpClick: () -> Unit = {},
    onDownClick: () -> Unit = {},
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondo_menu),
            contentDescription = "Fondo manual",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        IconButton(
            onClick = { navController?.navigate(AppsView.MenuView.name) },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Volver",
                tint = Color.White
            )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(34.dp)
            ) {
                ControlButton(onClick = onUpClick, icon = Icons.Default.KeyboardArrowUp)

                Row(
                    horizontalArrangement = Arrangement.spacedBy(120.dp), // Más separación
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ControlButton(onClick = onLeftClick, icon = Icons.Default.KeyboardArrowLeft)
                    ControlButton(onClick = onRightClick, icon = Icons.Default.KeyboardArrowRight)
                }

                ControlButton(onClick = onDownClick, icon = Icons.Default.KeyboardArrowDown)
            }
        }
    }
}
@Composable
fun ControlButton(onClick: () -> Unit, icon: androidx.compose.ui.graphics.vector.ImageVector) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(80.dp)
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .padding(8.dp),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(48.dp)
        )
    }
}
@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
@Composable
fun ManualViewPreview() {
    ManualView(navController = null)
}
