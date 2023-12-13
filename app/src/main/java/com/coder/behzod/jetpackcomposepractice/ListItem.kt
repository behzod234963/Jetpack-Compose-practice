package com.coder.behzod.jetpackcomposepractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ListItem(name:String,prof:String){

    Column {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ){
            Column {
                Row {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_background)
                        , contentDescription = "fgnhjm",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .size(64.dp)
                            .clip(CircleShape))
                    Column(modifier = Modifier
                        .padding(start = 10.dp,top = 10.dp)
                        ,verticalArrangement = Arrangement.Center) {
                        Text(text = name, fontSize = 20.sp)
                        Text(text = prof)
                    }
                }
            }
        }
    }
}