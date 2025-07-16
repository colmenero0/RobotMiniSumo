package com.example.robotminisumo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.robotminisumo.ui.theme.RobotMiniSumoTheme
import mx.com.robotminisumo.appUI.navigation.AppsNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp { }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    RobotMiniSumoTheme {
        AppsNavigation()
//        RegisterViewPreview()
//        LoginViewPreview()
    }
}
