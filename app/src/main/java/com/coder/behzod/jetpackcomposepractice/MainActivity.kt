package com.coder.behzod.jetpackcomposepractice

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.tooling.preview.Wallpapers
import kotlin.reflect.KClass

const val NAME = "behzod coder"
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
             MainActivityUI()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MainActivityUI(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red),
        verticalArrangement = Arrangement.Center) {
        Text(text = "Behzod")
        Text(text = "Behzod")
        Text(text = "Behzod")
    }
    Row(Modifier.background(Color.Gray)){
        Text(text = "Behzod")
        Text(text = "Behzod")
        Text(text = "Behzod")
    }
}