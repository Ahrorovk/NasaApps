package com.ahrorovk.nasaapp.Screens.HomeScreen.components

import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.nasaapp.ui.theme.GRAY
import com.ahrorovk.nasaapp.ui.theme.YELLOW

@SuppressLint("InvalidColorHexValue")
@Composable
fun CustomBox(
    title:String,
    onClick: () -> Unit,
    boolean: Boolean
){
    Spacer(modifier= Modifier.padding(vertical=6.dp))
    Box(modifier= Modifier
        .padding(start = 14.dp, end = 14.dp)
        .fillMaxWidth()
        .height(60.dp)
        .clip(RoundedCornerShape(5.dp))
        .background(if(!boolean)YELLOW else GRAY),
    contentAlignment =Alignment.Center ){
            Row(modifier= Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
                Text(title, fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
                IconButton(onClick = {onClick()}) {
                    Icon(tint = Color.White, imageVector = Icons.Default.ArrowForwardIos, contentDescription = null,modifier=Modifier.size(20.dp))
                }
            }
    }
}