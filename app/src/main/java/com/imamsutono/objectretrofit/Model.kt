package com.imamsutono.objectretrofit

import com.google.gson.annotations.SerializedName

data class Model(
        @SerializedName("status") // harus sama dengan key pada json
        val status: Boolean?,
        @SerializedName("message")
        val message: String?,
        @SerializedName("arrayInt")
        val arrayInt: MutableList<Int>?,
        @SerializedName("arrayString")
        val arrayString: MutableList<String>?,
        @SerializedName("data")
        val data: MutableList<Data>?
)

data class Data(
        @SerializedName("id")
        val id: String?,
        @SerializedName("nama")
        val nama: String?
)