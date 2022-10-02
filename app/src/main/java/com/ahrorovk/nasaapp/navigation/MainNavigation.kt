package com.ahrorovk.nasaapp.navigation

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ahrorovk.nasaapp.Screen
import com.ahrorovk.nasaapp.Screens.InfoScreen.InfoGraph
import com.ahrorovk.nasaapp.Screens.MainViewModel

@OptIn(ExperimentalAnimationApi::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MainNavigation(viewModel: MainViewModel, context: Context) {
//    val navController = rememberNavController()
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentDestination = navBackStackEntry?.destination
//    NavHost(navController = navController, startDestination = Screen.NAVIGATION_SCREEN.route) {
//        composable(route = Screen.NAVIGATION_SCREEN.route) {
//           Navigation(viewModel , context )
//        }
//        composable(Screen.INFO_GRAPH.route) { InfoGraph(viewModel,context) }
//    }
}