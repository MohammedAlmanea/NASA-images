package com.example.nasaimages.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.nasaimages.R


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Screen(viewModel: ViewModel = hiltViewModel())
{

    val state = viewModel.state.value
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.primary
    ) {
        if (state.isLoading || state.error.isNotEmpty()) {
            // both error and isLoading need a box to align content
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            )
            {
                if (state.isLoading)
                    CircularProgressIndicator()
                if (state.error.isNotEmpty())
                    Text(text = state.error)
            }
        } else { //then state is success
            LazyColumn(
                modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(16.dp)
            , horizontalAlignment = Alignment.CenterHorizontally

            )
            {
                items(
                   1
                )
                {
                    Image(
                        painterResource(id = R.drawable.nasa_logo),
                        "Nasa Logo",
                        modifier = Modifier.size(150.dp)
                    )
                    Text("Random Pictures\n    From NASA", style = MaterialTheme.typography.h1
                        ,color = MaterialTheme.colors.onSurface)
                    val numberstate = remember {
                        mutableStateOf(-1)
                    }
                    Spacer(Modifier.height(26.dp))
//
                    ClickBox()
                    {
                        numberstate.value=it
                    }
                    Spacer(Modifier.height(26.dp))
                    if (numberstate.value!=-1)
                        state.images?.collection?.let { it1 -> ImageGenerate(it1.items) }
                }
                }
            }
            }
        }

