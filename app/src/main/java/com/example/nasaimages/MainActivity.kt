package com.example.nasaimages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.nasaimages.ui.Screen

import com.example.nasaimages.ui.theme.NASAImagesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NASAImagesTheme {
            Screen()
            }
        }
    }
}
