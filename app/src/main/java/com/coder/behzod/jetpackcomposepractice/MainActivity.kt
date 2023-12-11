package com.coder.behzod.jetpackcomposepractice

import android.app.Activity
import android.app.Fragment
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.Wallpaper
import androidx.compose.ui.tooling.preview.Wallpapers
import com.coder.behzod.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

const val NAME = "behzod coder"
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            newText(text = NAME)
        }
    }
}

@Composable
fun newText(text:String){
    Text(text = text)
}
