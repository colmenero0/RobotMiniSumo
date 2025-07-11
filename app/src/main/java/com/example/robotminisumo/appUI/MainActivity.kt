package com.example.robotminisumo.appUI


import androidx.compose.runtime.Composable
import com.example.robotminisumo.ui.theme.RobotMiniSumoTheme
import mx.com.robotminisumo.appUI.navigation.AppsNavigation


@Composable
fun MyApp(content: @Composable () -> Unit) {
    RobotMiniSumoTheme {
        AppsNavigation( )
    }
}





