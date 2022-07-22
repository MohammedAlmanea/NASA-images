package com.example.nasaimages.data.domin

import retrofit2.http.GET

    interface API {
        @GET("/search?&media_type=image")
        suspend fun getImages(): zz
    }
