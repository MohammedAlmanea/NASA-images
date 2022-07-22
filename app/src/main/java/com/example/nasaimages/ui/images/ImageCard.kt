package com.example.nasaimages.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nasaimages.data.domin.Item
import com.example.nasaimages.data.domin.zz
import com.example.nasaimages.ui.theme.ImageCall
import kotlin.random.Random

@Composable
fun ImageCard(pic : List<Item>,img: Item)
{
    Card(
        modifier = Modifier
            .fillMaxSize(),
        shape = RoundedCornerShape(20.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primaryVariant),
            contentAlignment = Alignment.Center


        )
        {
            ImageCall(
                url = img.links[0].href,
                desc = null, Modifier
            )
        }

    }
    }
