package com.x990.demo.appUI.app.view.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.robotminisumo.appUI.app.view.componentes.LoaderView

@Composable
fun SplashView(navController: NavController?,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(130.dp))
//            Image(
//                painter = painterResource(id = R.drawable.logo_bbva),
//                contentDescription = "Logo BBVA",
//                modifier = Modifier.size(200.dp)
//            )
            LoaderView(modifier = Modifier.align(Alignment.CenterHorizontally))

        }
    }
}

@Composable
@Preview(showBackground = true, name = "X990", device = "spec:width=360dp,height=640dp,dpi=320")
fun SplashViewPreview() {
    SplashView(
        navController = null,
    )
}
