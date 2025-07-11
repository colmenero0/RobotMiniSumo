package com.example.robotminisumo.appUI.navigation

enum class AppsView{
    LoginView,
    AutonomoView,
    LoaderView,
    ManualView,
    MenuView,
    RegisterView,
    SplashView;

    companion object {
        fun fromRoute(route: String?): AppsView = when (route?.substringBefore("/")) {
            SplashView.name -> SplashView
            LoginView.name -> LoginView
            AutonomoView.name -> AutonomoView
            LoaderView.name -> LoaderView
            ManualView.name -> ManualView
            MenuView.name ->  MenuView
            RegisterView.name -> RegisterView

            else -> throw IllegalArgumentException("Route $route is not recognize")
        }
    }
}