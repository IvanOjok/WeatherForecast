package com.ivanojok.weatherforecast.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    fun createRetrofit(): WeatherService {
        val retrofit = Retrofit.Builder().baseUrl("https://api.openweathermap.org")
            .addConverterFactory(GsonConverterFactory.create()).build()

        val service = retrofit.create(WeatherService::class.java)
        return service
    }
}