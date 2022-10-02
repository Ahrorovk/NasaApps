package com.ahrorovk.nasaapp.Screens.InfoScreen

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahrorovk.nasaapp.Constants.bool
import com.ahrorovk.nasaapp.Screen
import com.ahrorovk.nasaapp.Screens.MainViewModel

@Composable
fun InfoGraph(viewModel: MainViewModel, context:Context){
    val navController = rememberNavController()
    bool = false
    NavHost(navController = navController, startDestination = Screen.INFO_ABOUT_NASA_SCREEN.route){
        composable(Screen.INFO_ABOUT_NASA_SCREEN.route){ InfoAboutNasaScreen(
            navController,
            context,
            viewModel
        )
        }
    }
}