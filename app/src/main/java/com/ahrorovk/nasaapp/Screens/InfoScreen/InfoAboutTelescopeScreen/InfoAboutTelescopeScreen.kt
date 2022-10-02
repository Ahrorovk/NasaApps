package com.ahrorovk.nasaapp.Screens.InfoScreen.InfoAboutTelescopeScreen

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ahrorovk.nasaapp.R
import com.ahrorovk.nasaapp.Screens.MainViewModel
import com.ahrorovk.nasaapp.ui.theme.BLACK
import com.ahrorovk.nasaapp.ui.theme.YELLOW

@Composable
fun InfoAboutTelescopeScreen(navController: NavController, context: Context, viewModel: MainViewModel) {
    val listOfNewsOfTelescope = viewModel.listOfNewsOfTeleScope
    Scaffold(modifier = Modifier.background(BLACK),
        topBar = {
            TopAppBar(
                backgroundColor = BLACK
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            tint = Color.White,
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null
                        )
                    }
                    Spacer(modifier = Modifier.padding(20.dp))
                    Text("James Webb Space Telescope (JWST)", fontSize = 25.sp, color = Color.Red)
                }
            }
        }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BLACK)
        ) {
            Spacer(Modifier.padding(vertical = 10.dp))
            LazyColumn() {
                item {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.telescope),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .height(200.dp)
                        )
                    }
                    Text(
                        listOfNewsOfTelescope[0], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        listOfNewsOfTelescope[1], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        listOfNewsOfTelescope[3], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        "Tasks", fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = YELLOW
                    )
                    Text(
                        listOfNewsOfTelescope[4], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        "Funding", fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = YELLOW
                    )
                    Text(
                        listOfNewsOfTelescope[5], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.nasastelescopeclearscriticalsunshielddeployment),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .height(200.dp)
                        )
                    }
                    Text(
                        listOfNewsOfTelescope[6], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = YELLOW
                    )

                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.jameswebbspacetelescopetheanatomyofajwstmirror),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .height(200.dp)
                        )
                    }
                    Text(
                        listOfNewsOfTelescope[7], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = YELLOW
                    )

                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.jwsthsthexagonalmirrors),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .height(200.dp)
                        )
                    }
                    Text(
                        listOfNewsOfTelescope[8], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}