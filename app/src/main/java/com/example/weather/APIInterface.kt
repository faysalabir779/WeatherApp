package com.example.weather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city:String,
        @Query("appid") appid: String,
        @Query("units") units: String
    ): Call<WeatherApp>
}