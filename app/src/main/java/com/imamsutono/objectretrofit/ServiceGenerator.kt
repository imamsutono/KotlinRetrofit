package com.imamsutono.objectretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceGenerator {
    companion object {
        fun createBase(): Retrofit {
            val retrofit: Retrofit = Retrofit.Builder().baseUrl("http://rxatnys.id/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit
        }
    }
}