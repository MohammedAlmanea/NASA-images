package com.example.nasaimages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.toArgb
import com.example.nasaimages.ui.Screen

import com.example.nasaimages.ui.theme.NASAImagesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NASAImagesTheme {
                window.statusBarColor =
                    MaterialTheme.colors.primary.toArgb()
            Screen()
            }
        }
    }
}
