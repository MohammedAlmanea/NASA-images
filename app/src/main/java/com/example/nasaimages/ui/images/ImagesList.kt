package com.example.nasaimages.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.nasaimages.data.domin.zz

@Composable
fun ImagesList(pic : zz) :String
{
val l = remember {
    List(pic.collection.items.size)
    { it ->
        pic.collection.items[it].links[0].href
    }
}
    return l.random()
}