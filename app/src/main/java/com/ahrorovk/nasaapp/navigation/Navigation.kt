package com.ahrorovk.nasaapp.navigation

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ahrorovk.nasaapp.Screen
import com.ahrorovk.nasaapp.Screens.HomeScreen.HomeScreen
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutNasaScreen
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen.InfoAboutTelescopeScreen
import com.ahrorovk.nasaapp.Screens.MainViewModel

@OptIn(ExperimentalAnimationApi::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(viewModel: MainViewModel, context: Context) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavHost(navController = navController, startDestination = Screen.HOME_SCREEN.route) {
        composable(route = Screen.HOME_SCREEN.route) {
            HomeScreen(navController = navController, viewModel)
        }
        composable(Screen.INFO_ABOUT_NASA_SCREEN.route) {
            InfoAboutNasaScreen(navController, context, viewModel)
        }
        composable(Screen.INFO_ABOUT_TELESCOPE_SCREEN.route){
            InfoAboutTelescopeScreen(navController = navController, context = context, viewModel = viewModel)
        }
//            composable(route = Screen.FAVORITES_SCREEN.route) {
//                SavedNewsScreen(navController,context,viewModel)
//            }
    }
}
private fun NavDestination.isCurrentDestinationHasBottomSheet() =
    parent?.route != Screen.HOME_SCREEN.route && parent?.route != Screen.FAVORITES_SCREEN.route
