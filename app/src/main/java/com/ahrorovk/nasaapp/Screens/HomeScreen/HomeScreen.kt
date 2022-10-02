package com.ahrorovk.nasaapp.Screens.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ahrorovk.nasaapp.Constants.bool
import com.ahrorovk.nasaapp.R
import com.ahrorovk.nasaapp.Screen
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.CustomBox
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.HomeDrawer
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.HomeScreenTopAppBar

import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.BIOLOGY

import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.EARTH
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.EUROPE
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.GALAXY

import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.TELESCOPE
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.MERCEDES
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.POWERSTATION
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.SAMSUNG
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.SCIENCE
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.SPACE
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.TECHNOLOGY
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory.USA
import com.ahrorovk.nasaapp.Screens.MainViewModel
import com.ahrorovk.nasaapp.ui.theme.BLACK

@SuppressLint("UnrememberedMutableState")
@Composable
fun HomeScreen(navController: NavController,viewModel: MainViewModel) {
    bool = true
    val navController1 = rememberNavController()
    val listOfNews = viewModel.listOfNewsOfNasa
    val listOfCategory = listOf(GALAXY, TECHNOLOGY, BIOLOGY, SCIENCE,SPACE,POWERSTATION,EARTH,
        USA, EUROPE)
    var searchTextField = viewModel.searchTextField
    var counter: Int = viewModel.testButton
    val listOfScreens = viewModel.listOfScreens
    var index by remember { mutableStateOf(0) }
    Scaffold(
//        bottomBar = {
//                    BottomBar(navController)
//        },
        drawerContent = {
            HomeDrawer(
                navController = navController,
                username = viewModel.username.value,
                phoneNumber = viewModel.phoneNumber.value,
                iconButtononClick = {
                    navController.navigate(Screen.PROFILE_SCREEN.route)
                }
            )
        },
        topBar = {
            HomeScreenTopAppBar(
                value = searchTextField,
                viewModel = viewModel,
                backgroundColor = BLACK,
                iconButtonOnClick = {
                    viewModel.setSearch("")
                }, bool = false, backProfileIconButtonOnClick = {})

        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(BLACK)
        ) {

            Column() {

                Spacer(Modifier.padding(vertical = 10.dp))
                Row(Modifier.padding(start = 14.dp)) {
                    Image(
                        painterResource(id = R.drawable.topappbar), contentDescription = null,
                        modifier = Modifier
                            .height(130.dp)
                            .width(200.dp)
                    )
                }
                Spacer(Modifier.padding(vertical = 3.dp))
                if(searchTextField == "NASA")
                CustomBox(
                    title = "NASA", onClick = {
                        viewModel.firstNews(1)
                        navController.navigate(Screen.INFO_ABOUT_NASA_SCREEN.route)
                    },
                    boolean = false
                )
                else if(searchTextField == "Telescope"){
                    CustomBox(
                        title = "James Webb Space Telescope", onClick = {
                            viewModel.firstNews(1)
                            if (counter == 1)
                                navController.navigate(Screen.INFO_ABOUT_TELESCOPE_SCREEN.route)
                        },
                        boolean = counter != 1
                    )
                }
                else if(searchTextField == "") {
                    CustomBox(
                        title = "NASA", onClick = {
                            viewModel.firstNews(1)
                            navController.navigate(Screen.INFO_ABOUT_NASA_SCREEN.route)
                        },
                        boolean = false
                    )
                    CustomBox(
                        title = "James Webb Space Telescope", onClick = {
                            viewModel.firstNews(1)
                            if (counter == 1)
                                navController.navigate(Screen.INFO_ABOUT_TELESCOPE_SCREEN.route)
                        },
                        boolean = counter != 1
                    )
                }
            LazyColumn(){
             items(listOfCategory){category->
                 if(searchTextField == category){
                     CustomBox(
                         title =category, onClick = {
                         },
                         boolean = true
                     )
                 }
                 else if(searchTextField == "")
                 {
                     CustomBox(
                         title = category, onClick = {
                         },
                         boolean = true
                     )
                 }
             }
            }
            }
        }
    }
}

/*  Column(modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier=Modifier.fillMaxWidth().height(20.dp)
            .clickable {
                viewModel.getNewsAndroid()
                navController.navigate(Screen.INFO_SCREEN) }
        ){
            Text("Category: android")
        }
        Box(modifier=Modifier.fillMaxWidth().height(20.dp)
            .clickable {
                viewModel.getNewsScience()
                navController.navigate(Screen.INFO_SCREEN) }
        ){
            Text("Category: science")
        }
    }*/