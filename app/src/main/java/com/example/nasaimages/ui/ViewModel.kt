package com.example.nasaimages.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nasaimages.common.Response
import com.example.nasaimages.data.domin.zz
import com.example.nasaimages.data.repository.ImageRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(
    private val repository: ImageRepo
) : ViewModel() {
    private val _state = mutableStateOf(StateList<zz>())
    val state: State<StateList<zz>> = _state
    init {
        getImages()
    }

    fun getImages() {
        repository.getAllImages().onEach {
            when (it) {
                is Response.Loading -> {
                    _state.value = StateList(isLoading = true)
                }
                is Response.Success -> {

                    _state.value = StateList(images = it.data)
                }
                is Response.Error -> {
                    _state.value = StateList(error = it.message ?: "error")
                }

            }
        }.launchIn(viewModelScope)
    }

}
