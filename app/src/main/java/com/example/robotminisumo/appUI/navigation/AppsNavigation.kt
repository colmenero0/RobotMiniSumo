package mx.com.robotminisumo.appUI.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.robotminisumo.appUI.app.view.login.LoginView
import com.example.robotminisumo.appUI.navigation.AppsView
import com.x990.demo.appUI.app.view.splash.SplashView

@Composable
fun AppsNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppsView.SplashView.name) {
        composable(AppsView.SplashView.name) {
            SplashView(navController = navController)
        }
        composable(AppsView.LoginView.name) {
            LoginView(navController = navController)
        }
    }

}

