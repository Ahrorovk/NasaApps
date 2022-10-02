package com.ahrorovk.nasaapp

sealed class Screen(val route: String) {
    object  HOME_SCREEN:Screen("HOME_SCREEN")
    object INFO_ABOUT_NASA_SCREEN :Screen("INFO_ABOUT_NASA_SCREEN")
    object INFO_ABOUT_TELESCOPE_SCREEN :Screen("INFO_ABOUT_TELESCOPE_SCREEN")
    object PROFILE_SCREEN:Screen("PROFILE_SCREEN")
    object FAVORITES_SCREEN :Screen("FAVORITES_SCREEN")
    object NAVIGATION_SCREEN: Screen("NAVIGATION_SCREEN")
    object INFO_GRAPH :Screen("INFO_GRAPH")
}
