package com.example.nasaimages.data.domin


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("total_hits")
    val totalHits: Int
)