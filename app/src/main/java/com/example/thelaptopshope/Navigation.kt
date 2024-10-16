package com.example.thelaptopshope



sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details")
    object Payment: Screen("payment")
    object Homies : Screen("homies")
}