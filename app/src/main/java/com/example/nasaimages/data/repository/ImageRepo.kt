package com.example.nasaimages.data.repository

import com.example.nasaimages.common.Response
import com.example.nasaimages.data.domin.API
import com.example.nasaimages.data.domin.zz
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ImageRepo  @Inject constructor(
    private val api_service : API
)
{

        suspend fun getImages(): zz{
            return api_service.getImages()
        }

        fun getAllImages(): Flow<Response<zz>> = flow {
            try {
                emit(Response.Loading<zz>())
                val image = getImages()
                emit(Response.Success<zz>(image))

            } catch (e: HttpException){
                emit(Response.Error<zz>(e.localizedMessage ?: "There is something wrong"))
            }
            catch (e: IOException)
            {
                emit(Response.Error<zz>("Failed ot connect to server\n┗( T﹏T )┛"))
            }

        }


    }
