package edu.unicauca.navigationmovil

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(modifier: Modifier = Modifier){
    //objeto que permite almacenar rutas que estoy en mi aplicacion
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.HomeScreen.name){
        //definir las rutas de mi aplicacion
        //ScreenButton("Android")
        composable(route = Screens.HomeScreen.name){
            ScreenButton(data = DataApp.getScreensData()[0], onCLickButton = {navController.navigate(Screens.SecondScreen.name)})
        }
        composable(route = Screens.SecondScreen.name){
            ScreenButton(data = DataApp.getScreensData()[1], onCLickButton = {navController.navigate(Screens.FinalScreen.name)})
        }
        composable(route = Screens.FinalScreen.name){
            ScreenButton(data = DataApp.getScreensData()[2], onCLickButton = {navController.navigate(Screens.HomeScreen.name)})
        }
    }

}


enum class Screens(){
    HomeScreen,
    SecondScreen,
    FinalScreen
}


