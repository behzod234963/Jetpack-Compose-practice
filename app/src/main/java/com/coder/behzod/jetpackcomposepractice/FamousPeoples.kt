package com.coder.behzod.jetpackcomposepractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun FamousPeople(model:PeoplesModel){
    Column(horizontalAlignment = Alignment.CenterHorizontally
        ,modifier = Modifier
            .padding(5.dp)
            .background(Color.White)){
        Image(painter = painterResource(id = model.imageID)
            , contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(60.dp)
                .clip(CircleShape))
        Text(text = model.title)
    }
}