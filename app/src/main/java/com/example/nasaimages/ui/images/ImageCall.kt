package com.example.nasaimages.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.nasaimages.R

@OptIn(ExperimentalCoilApi::class)
@Composable
fun ImageCall(
    url: String,
    desc: String?,
    modifier: Modifier
)
{
    Box(modifier.fillMaxSize())
    {
        val painter = rememberImagePainter(data = url,
            builder = {
                placeholder(drawableResId = R.drawable.placeholder_image).crossfade(true)

            }
        )
        Image(
            painter = painter,
            contentDescription = desc,
            contentScale = ContentScale.Crop,
            modifier = modifier.size(550.dp)
        )
    }
}

