package com.example.thelaptopshope

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost

import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.thelaptopshope.Dta.FakeDTABASE

@Composable
fun navigation(navController: NavHostController = rememberNavController()){
    NavHost(navController = navController, startDestination = Screen.Home.route)
    {
        composable(Screen.Home.route){
            Home(navController = navController, doglist =FakeDTABASE.pcList )
        }

        composable("${Screen.Details.route}/{id}/{title}/{location}",
            arguments = listOf(navArgument("id"){ type = NavType.IntType })
        ){
            Details(navController = navController, it.arguments?.getInt("id")?:0 )
        }
        composable(Screen.Payment.route)
        {
            paymentScreen(navController=navController)
        }
        
        composable(Screen.Homies.route){
            homies(navController = navController)
        }
    }
}