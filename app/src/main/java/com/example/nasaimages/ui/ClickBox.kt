package com.example.nasaimages.ui

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun ClickBox(
    RandomNum: (Int) -> Unit
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .size(100.dp)
            .background(MaterialTheme.colors.primaryVariant)
            .clickable {
                RandomNum(
                    Random.nextInt(101)
                )
            },
        contentAlignment = Alignment.Center
    )
    {
        Text("CLICK HERE", color = MaterialTheme.colors.onPrimary)
    }
}