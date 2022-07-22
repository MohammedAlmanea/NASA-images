package com.example.nasaimages.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nasaimages.data.domin.Item
@Composable
fun ImageGenerate(pic :List<Item>)
{
    val img =pic.random()
    ImageCard(pic,img)
    Spacer(modifier = Modifier.height(20.dp))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp))
            .background(MaterialTheme.colors.primaryVariant)
            .padding(16.dp)
    ) {
        Text(
            text = "Title : \n${img.data[0].title}",
            modifier = Modifier
                .fillMaxWidth(), style = MaterialTheme.typography.body1

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "DATE :\n${img.data[0].dateCreated}",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.body1
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            "Description : \n${img.data[0].description}",
            modifier = Modifier.fillMaxWidth(), style = MaterialTheme.typography.body1

        )

    }
}