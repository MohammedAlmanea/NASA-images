package com.example.nasaimages.ui

data class StateList<T>(
        val isLoading: Boolean =false
        , val error: String = ""
        , val images: T? = null
)