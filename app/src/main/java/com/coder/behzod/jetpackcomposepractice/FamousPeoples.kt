package com.coder.behzod.jetpackcomposepractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun FamousPeople(model: PeoplesModel) {
    var isExpanded by remember{
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = model.imageID), contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(60.dp)
                .clip(CircleShape)
        )
        Column (modifier = Modifier.padding(top = 5.dp, start = 5.dp)){
            Text(text = model.title,
                modifier = Modifier.padding(5.dp))
            Text(text = model.text
            ,modifier = Modifier.clickable {
                isExpanded = !isExpanded
                }, maxLines = if (isExpanded) 10 else 1)
        }
    }
}