package com.ahrorovk.nasaapp.Screens.InfoScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.ahrorovk.nasaapp.ui.theme.YELLOW

@Composable
fun CustomInfoScreenBox(
    title:String,
    imageUrl:String,
    content:String,
    colorOfIconFavorite:Color,
    IconFavoriteBool:Boolean,
    IconBookMarkBool:Boolean,
    colorOfIconBookMark:Color,
    IconFavoriteOnClick:()->Unit,
    IconSaveOnClick:()->Unit,
    IconDeleteOnClick:()->Unit,
    SaveDeleteBool:Boolean,
    listOfNews:List<String>
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(YELLOW)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(
                    title,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 3.dp)
                )
            }
            Spacer(Modifier.padding(vertical=3.dp))
            Divider(modifier= Modifier
                .fillMaxWidth())
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp),
                    contentScale = ContentScale.Crop,
                    painter = rememberAsyncImagePainter(model = imageUrl),
                    contentDescription = null
                )
            }
            Spacer(modifier=Modifier.padding(vertical = 6.dp))
//            Divider(modifier= Modifier
//                .fillMaxWidth()
//                .padding(start = 2.dp, end = 2.dp))
            Row(modifier= Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                IconButton(onClick = { IconFavoriteOnClick() }) {
                    Icon(
                        imageVector = if(!IconFavoriteBool){
                            Icons.Outlined.FavoriteBorder
                        } else
                            Icons.Outlined.Favorite, contentDescription = null,
                        tint = colorOfIconFavorite
                    )
                }
                IconButton(onClick = {
                    if(!SaveDeleteBool)
                        IconSaveOnClick()
                    else
                    IconDeleteOnClick()
                }) {
                    Icon(
                        imageVector = if(IconBookMarkBool){
                            Icons.Outlined.BookmarkBorder
                        } else
                    Icons.Filled.Bookmark, contentDescription = null,
                        tint = colorOfIconBookMark
                    )
                }
            }
            Spacer(modifier=Modifier.padding(vertical = 6.dp))
            Row(modifier=Modifier.padding(start=4.dp, end = 4.dp)) {
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                for(i in listOfNews.indices) {
                    Text(content, fontSize = 20.sp)
                }
            }
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//
//                    Text(
//                        author,
//                        fontSize = 16.sp,
//                        fontWeight = FontWeight.SemiBold,
//                        color = Color.Black
//                    )
//                   Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                       Text(
//                           time,
//                           fontSize = 12.sp,
//                           fontWeight = FontWeight.Medium,
//                       )
//                       Spacer(modifier = Modifier.padding(3.dp))
//                       Text(
//                           date,
//                           fontSize = 12.sp,
//                           fontWeight = FontWeight.Bold,
//                       )
//                   }
//            }
            Spacer(modifier = Modifier.padding(5.dp))
//            Divider(modifier= Modifier
//                .fillMaxWidth())
            Spacer(modifier = Modifier.padding(5.dp))
        }
    }
}