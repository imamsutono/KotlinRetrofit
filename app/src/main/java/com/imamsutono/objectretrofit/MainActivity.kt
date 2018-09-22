package com.imamsutono.objectretrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config: ServiceInterface = ServiceGenerator.createBase().create(ServiceInterface::class.java)

        val call: Call<Model> = config.getData()

        call.enqueue(object: Callback<Model> {
            override fun onFailure(call: Call<Model>, t: Throwable) {
                Log.e(MainActivity::class.java.simpleName + ".error", t.toString())
            }

            override fun onResponse(call: Call<Model>, response: Response<Model>) {
                if(response?.code() === 200) {
                    val convResponse = response?.body()
                    Log.e("response: ", convResponse?.message)
                }
            }

        })
    }
}
