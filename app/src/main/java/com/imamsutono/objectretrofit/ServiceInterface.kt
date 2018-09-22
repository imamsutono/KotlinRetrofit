package com.imamsutono.objectretrofit

import retrofit2.Call
import retrofit2.http.GET

interface ServiceInterface {

    @GET("tesapi/index.php/MainRoutes")
    fun getData(): Call<Model>
}