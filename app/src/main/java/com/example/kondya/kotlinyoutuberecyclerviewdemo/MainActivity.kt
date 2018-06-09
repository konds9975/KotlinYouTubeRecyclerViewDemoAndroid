package com.example.kondya.kotlinyoutuberecyclerviewdemo

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        recyclerview_main.setBackgroundColor(Color.BLUE)

        recyclerview_main.layoutManager = LinearLayoutManager(this)
        recyclerview_main.adapter = MainAdapter()

        fetchJson()

    }
    fun fetchJson(){

        println("Attempting to fetch JSON")

        val url = "https://api.letsbuildthatapp.com/youtube/home_feed"

        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback{

            override fun onResponse(call: Call?, response: Response?) {
                val body = response?.body()?.string()
                println(body)
            }

            override fun onFailure(call: Call?, e: IOException?) {

                println("Failure to execute request")
            }
        })



    }
}
