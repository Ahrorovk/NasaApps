package com.ahrorovk.nasaapp.Screens.HomeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Cancel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.nasaapp.R
import com.ahrorovk.nasaapp.Screens.MainViewModel
import com.ahrorovk.nasaapp.ui.theme.GRAY
import com.ahrorovk.nasaapp.ui.theme.YELLOW

@Composable
fun HomeScreenTopAppBar(
    backgroundColor:Color,
    value:String,
    iconButtonOnClick:()->Unit,
    viewModel: MainViewModel,
    bool:Boolean,
    backProfileIconButtonOnClick:()->Unit
    )
{
    Box(modifier= Modifier
        .fillMaxWidth()
        .height(55.dp)
        .background(backgroundColor)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 2.dp, end = 2.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if(!bool) {
               Text("SPACE GUIDE", fontSize = 30.sp,
                   fontStyle = FontStyle.Italic,
               fontWeight = FontWeight.Bold,
               color = YELLOW)
                Row() {
                    TextField(
                        modifier = Modifier
                            .width(200.dp)
                            .height(50.dp),
                        value = value,
                        leadingIcon = {
                            Icon(tint = Color.White,
                                imageVector = Icons.Default.Search,
                                contentDescription = null
                            )
                        },
                        onValueChange = {
                            viewModel.setSearch(it)
                        },
                        placeholder = {
                            Text("Search more", fontSize = 12.sp,color = Color.White)
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color.White,
                            disabledTextColor = Color.Transparent,
                            backgroundColor = Color.Transparent,
                            focusedIndicatorColor = Color.White,
                            unfocusedIndicatorColor = Color.White,
                            disabledIndicatorColor = Color.White
                        )
                    )
                    if (value != "") {
                        IconButton(onClick = {
                            iconButtonOnClick()
                        }) {
                            Icon(tint = Color.White,
                                modifier = Modifier.size(14.dp),
                                imageVector = Icons.Outlined.Cancel,
                                contentDescription = null
                            )
                        }
                    }
                }
            }
            else {
                IconButton(onClick = { backProfileIconButtonOnClick() }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
                Text(modifier=Modifier.fillMaxWidth(), textAlign = TextAlign.Center,text="Profile",fontSize = 30.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
            }
        }
    }
}