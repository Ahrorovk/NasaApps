package com.ahrorovk.nasaapp.Screens.InfoScreen

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.PlusOne
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ahrorovk.nasaapp.R
import com.ahrorovk.nasaapp.Screens.HomeScreen.components.ListOfCategory
import com.ahrorovk.nasaapp.Screens.MainViewModel
import com.ahrorovk.nasaapp.ui.theme.BLACK
import com.ahrorovk.nasaapp.ui.theme.YELLOW

@SuppressLint("UnrememberedMutableState", "ShowToast")
@Composable
fun InfoAboutNasaScreen(navController: NavController,context:Context,viewModel: MainViewModel) {
    val countOfFirstQuestion = viewModel.countOfFirstQuestion
    val countOfSecondQuestion = viewModel.countOfSecondQuestion
    val countOfThirdQuestion = viewModel.countOfThirdQuestion
    val countOfFourthQuestion = viewModel.countOfFourthQuestion
    val countOfFifthQuestion = viewModel.countOfFifthQuestion
    val color11 = remember{viewModel.colorOfFirst1}
    val color12 = viewModel.colorOfFirst2
    val color13 = viewModel.colorOfFirst3
    val color21 = viewModel.colorOfSecond1
    val color22 = viewModel.colorOfSecond2
    val color23 = viewModel.colorOfSecond3
    val color31 = viewModel.colorOfThird1
    val color32 = viewModel.colorOfThird2
    val color33 = viewModel.colorOfThird3
    val color41 = viewModel.colorOfFourth1
    val color42 = viewModel.colorOfFourth2
    val color43 = viewModel.colorOfFourth3
    val color51 = viewModel.colorOfFifth1
    val color52 = viewModel.colorOfFifth2
    val color53 = viewModel.colorOfFifth3
    val count1 = viewModel.count1
    val count2 = viewModel.count2
    val count3 = viewModel.count3
    val count4 = viewModel.count4
    val count5 = viewModel.count5
    var a1 by remember{ mutableStateOf(0)}
    var a11 by remember{ mutableStateOf(0)}
    var a111 by remember{ mutableStateOf(0)}
    var a2 by remember{ mutableStateOf(0)}
    var a22 by remember{ mutableStateOf(0)}
    var a222 by remember{ mutableStateOf(0)}
    var a3 by remember{ mutableStateOf(0)}
    var a33 by remember{ mutableStateOf(0)}
    var a333 by remember{ mutableStateOf(0)}
    var a4 by remember{ mutableStateOf(0)}
    var a44 by remember{ mutableStateOf(0)}
    var a444 by remember{ mutableStateOf(0)}
    var a5 by remember{ mutableStateOf(0)}
    var a55 by remember{ mutableStateOf(0)}
    var a555 by remember{ mutableStateOf(0)}
    val error = viewModel.error
    val listOfNewsNasa = viewModel.listOfNewsOfNasa
    var new = viewModel.news
    val listOfCategory = listOf(
        ListOfCategory.NASA
    )
    /*val listOfGet = listOf(
        viewModel.getNewsAndroid(),
        viewModel.getNewsIos(),
        viewModel.getNewsApple(),
        viewModel.getNewsSamsung(),
        viewModel.getNewsTechnology(),
        viewModel.getNewsScience(),
        viewModel.getNewsCars(),
        viewModel.getNewsHonda(),
        viewModel.getNewsBmw(),
        viewModel.getNewsMercedes(),
        viewModel.getNewsUsa(),
        viewModel.getNewsEurope(),
    )*/
    if (error.isNotEmpty()) {
        Text(error)
    }
    var i by remember { mutableStateOf(0) }

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
                    Spacer(modifier = Modifier.padding(55.dp))
                    Text("NASA", fontSize = 25.sp, color = Color.Red)
                }
            }
        }) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BLACK)
        ) {
            LazyColumn() {
                item {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.nasalogo),
                            contentDescription = null,
                            modifier = Modifier.size(75.dp)
                        )
                    }
                    Text(
                        listOfNewsNasa[0], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Column() {

                            Image(
                                painterResource(id = R.drawable.nasa_sites_nasa),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp)
                            )
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.CenterEnd
                            ) {
                                Text(
                                    "NASA Centers and Facilities", color = YELLOW,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                    }
                    Text(
                        listOfNewsNasa[1], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.austronaut),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        )
                    }
                    Text(
                        listOfNewsNasa[2], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = R.drawable.nasabudget),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        )
                    }
                    Text(
                        listOfNewsNasa[3], fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier=Modifier.padding(vertical = 6.dp))
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "To access the next article you must pass the test",
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = YELLOW
                        )
                    }
                    Spacer(modifier=Modifier.padding(vertical = 3.dp))
                    Text("1.How many workers does NASA have?\n",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a1++
                            viewModel.setCountOfFirst(1)
                            viewModel.setCount11(a1)
                                if(count1%2 == 1)
                                viewModel.setColorFirst1(Color.Green)
                            else
                                viewModel.setColorFirst1(Color.White)
                        }) {
                            Icon(tint = color11,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("13 000",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a11++
                            viewModel.setCountOfFirst(2)
                            viewModel.setCount11(a11)
                            if(count1%2 == 1)
                                viewModel.setColorFirst2(Color.Green)
                            else
                                viewModel.setColorFirst2(Color.White)
                        }) {
                            Icon(tint = color12,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("18 000",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a222++
                            viewModel.setCountOfFirst(3)
                            viewModel.setCount11(a222)
                            if(count1%2 == 1)
                                viewModel.setColorFirst3(Color.Green)
                            else
                                viewModel.setColorFirst3(Color.White)
                        }) {
                            Icon(tint = color13,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("21",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Spacer(modifier=Modifier.padding(vertical = 3.dp))
                    Text("2. When was NASA formed?\n",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a2++
                            viewModel.setCountOfSecond(1)
                            viewModel.setCount22(a2)
                            if(count2%2 == 1)
                                viewModel.setColorSecond1(Color.Green)
                            else
                                viewModel.setColorSecond1(Color.White)

                        }) {
                            Icon(tint = color21,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("1946",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a22++
                            viewModel.setCountOfSecond(2)
                            viewModel.setCount22(a22)
                            if(count2%2 == 1)
                                viewModel.setColorSecond2(Color.Green)
                            else
                                viewModel.setColorSecond2(Color.White)
                        }) {
                            Icon(tint = color22,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("1956",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a222++
                            viewModel.setCountOfSecond(3)
                            viewModel.setCount22(a222)
                            if(count2%2 == 1)
                                viewModel.setColorSecond3(Color.Green)
                            else
                                viewModel.setColorSecond3(Color.White)
                        }) {
                            Icon(tint = color23,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("1958",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Spacer(modifier=Modifier.padding(vertical = 3.dp))
                    Text("3. Who leads NASA?\n",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a3++
                            viewModel.setCountOfThird(1)
                            viewModel.setCount33(a3)
                            if(count3%2 == 1)
                                viewModel.setColorThird1(Color.Green)
                            else
                                viewModel.setColorThird1(Color.White)

                        }) {
                            Icon(tint = color31,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("Jeo Biden",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a33++
                            viewModel.setCountOfThird(2)
                            viewModel.setCount33(a33)
                            if(count3%2 == 1)
                                viewModel.setColorThird2(Color.Green)
                            else
                                viewModel.setColorThird2(Color.White)
                        }) {
                            Icon(tint = color32,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("Bill Nelson",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a333++
                            viewModel.setCountOfThird(3)
                            viewModel.setCount33(a333)
                            if(count3%2 == 1)
                                viewModel.setColorThird3(Color.Green)
                            else
                                viewModel.setColorThird3(Color.White)
                        }) {
                            Icon(tint = color33,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("Donald Trump",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Spacer(modifier=Modifier.padding(vertical = 3.dp))
                    Text("4. How many centres does NASA have in USA?\n",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a4++
                            viewModel.setCountOfFourth(1)
                            viewModel.setCount44(a4)
                            if(count4%2 == 1)
                                viewModel.setColorFourth1(Color.Green)
                            else
                                viewModel.setColorFourth1(Color.White)

                        }) {
                            Icon(tint = color41,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("20",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a44++
                            viewModel.setCountOfFourth(2)
                            viewModel.setCount44(a44)
                            if(count4%2 == 1)
                                viewModel.setColorFourth2(Color.Green)
                            else
                                viewModel.setColorFourth2(Color.White)
                        }) {
                            Icon(tint = color42,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("25",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a444++
                            viewModel.setCountOfFourth(3)
                            viewModel.setCount44(a444)
                            if(count4%2 == 1)
                                viewModel.setColorFourth3(Color.Green)
                            else
                                viewModel.setColorFourth3(Color.White)
                        }) {
                            Icon(tint = color43,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("140",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Spacer(modifier=Modifier.padding(vertical = 3.dp))
                    Text("5. What budget did NASA have in 2009?\n",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a5++
                            viewModel.setCountOfFifth(1)
                            viewModel.setCount55(a5)
                            if(count5%2 == 1)
                                viewModel.setColorFifth1(Color.Green)
                            else
                                viewModel.setColorFifth1(Color.White)

                        }) {
                            Icon(tint = color51,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("16.2 billion",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a55++
                            viewModel.setCountOfFifth(2)
                            viewModel.setCount55(a55)
                            if(count5%2 == 1)
                                viewModel.setColorFifth2(Color.Green)
                            else
                                viewModel.setColorFifth3(Color.White)
                        }) {
                            Icon(tint = color52,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("19.5 billion",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = {
                            a555++
                            viewModel.setCountOfFifth(3)
                            viewModel.setCount55(a555)
                            if(count5%2 == 1)
                                viewModel.setColorFifth3(Color.Green)
                            else
                                viewModel.setColorFifth3(Color.White)
                        }) {
                            Icon(tint = color53,imageVector = Icons.Default.Done, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(4.dp))
                        Text("17.6 billion",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                    }
                    Box(modifier=Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                    {
                        Button(onClick = {
                            Log.e("Hello"," 1-$countOfFirstQuestion 2-$countOfSecondQuestion 3-$countOfThirdQuestion 4-$countOfFourthQuestion 5-$countOfFifthQuestion")
                            if(countOfFirstQuestion == 2 && countOfSecondQuestion == 3 && countOfThirdQuestion == 2 && countOfFourthQuestion == 1 && countOfFifthQuestion == 3){
                                viewModel.testButton(1)
                                Log.e("Hello","Success 1-$countOfFirstQuestion 2-$countOfSecondQuestion 3-$countOfThirdQuestion 4-$countOfFourthQuestion 5-$countOfFifthQuestion")
                            }
                            else
                                viewModel.testButton(0)
                            viewModel.setCountOfFirst(0)
                            viewModel.setCountOfSecond(0)
                            viewModel.setCountOfThird(0)
                            viewModel.setCountOfFourth(0)
                            viewModel.setCountOfFifth(0)
                            viewModel.setColorFirst1(Color.White)
                            viewModel.setColorFirst2(Color.White)
                            viewModel.setColorFirst3(Color.White)
                            viewModel.setColorSecond1(Color.White)
                            viewModel.setColorSecond2(Color.White)
                            viewModel.setColorSecond3(Color.White)
                            viewModel.setColorThird1(Color.White)
                            viewModel.setColorThird2(Color.White)
                            viewModel.setColorThird3(Color.White)
                            viewModel.setColorFourth1(Color.White)
                            viewModel.setColorFourth2(Color.White)
                            viewModel.setColorFourth3(Color.White)
                            viewModel.setColorFifth1(Color.White)
                            viewModel.setColorFifth2(Color.White)
                            viewModel.setColorFifth3(Color.White)
                        },colors =  ButtonDefaults.buttonColors(YELLOW)){
                            if(viewModel.testButton == 0)
                            Text(text= "Отправить",
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.White)
                            else if(viewModel.testButton == 1)
                                Text(text= "Отправлено",
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White)
                        }

                        Toast.makeText(context,"Success",Toast.LENGTH_LONG)
                    }
                }
            }
        }
    }
}
    /*CustomInfoScreenBox(
                        title = listOfCategory[0],
                        imageUrl = news,
                        content = news,
                        IconFavoriteOnClick = {
                            counterOfIconFavorite++
                            viewModel.setCountIConFavoriteClick(counterOfIconFavorite)
                        },
                        colorOfIconFavorite = colorOfIconFavorite.value,
                        IconFavoriteBool = iconFavoriteBool.value,
                        IconSaveOnClick = {
                            counterOfIconBookMark++
                          viewModel.getNews(
                              title = listOfCategory[1],
                              imageUrl = listOfImage[0],
                              content = news,
                              countOfIconBookMark = counterOfIconBookMark
                          )
                            viewModel.setCountIconBookMarkClick(counterOfIconBookMark)
                        },
                        colorOfIconBookMark = colorOfIconBookMark.value,
                        IconBookMarkBool = iconBookMarkBool.value,
                        IconDeleteOnClick = {
                           this@LazyColumn.items(new) { new->
                               viewModel.deleteNote(new.id)
                           }
                            counterOfIconBookMark++
                            viewModel.setCountIconBookMarkClick(counterOfIconBookMark)
                        },
                        SaveDeleteBool = saveDeleteBool.value,
                        listOfNews = listOfNewsNasa
                    )
                    Spacer(modifier = Modifier.padding(6.dp))
                }

                items(listOfNewsNasa){
                    Row() {
                        IconButton(onClick = {
                            if (viewModel.counter == 1) {
                                viewModel.testButton(1)
                            }
                        }) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                        }
                        Spacer(modifier=Modifier.padding(5.dp))
                        Text("test$i")
                    }
                }*/