package mx.com.robotminisumo.appUI.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.robotminisumo.appUI.app.view.autonomo.AutonomoView
import com.example.robotminisumo.appUI.app.view.login.LoginView
import com.example.robotminisumo.appUI.app.view.manual.ManualView
import com.example.robotminisumo.appUI.app.view.menu.MenuView
import com.example.robotminisumo.appUI.app.view.register.RegisterView
import com.example.robotminisumo.appUI.navigation.AppsView
import com.x990.demo.appUI.app.view.splash.SplashView

@Composable
fun AppsNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppsView.LoginView.name) {
        composable(AppsView.LoginView.name) {
            LoginView(navController = navController)
        }
        composable(AppsView.RegisterView.name) {
            RegisterView(navController = navController)
        }
        composable(AppsView.MenuView.name) {
            MenuView(navController = navController)
        }
        composable(AppsView.SplashView.name) {
            SplashView(navController = navController)
        }
        composable(AppsView.AutonomoView.name) {
            AutonomoView(navController = navController)
        }
        composable(AppsView.ManualView.name) {
            ManualView(navController = navController)
        }
//        composable(AppsView.LoaderView.name) {
//            LoaderView(navController = navController)
//        }
    }
}
