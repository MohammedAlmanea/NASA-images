package com.example.nasaimages.di

import com.example.nasaimages.common.Constants
import com.example.nasaimages.data.domin.API
import com.example.nasaimages.data.repository.ImageRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Provides
    @Singleton
    fun provideAPIService(): API {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)
    }

    @Provides
    @Singleton
    fun provideRepo(api: API): ImageRepo {
        return ImageRepo(api_service = api)
    }
}