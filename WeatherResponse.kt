package com.package.weatherapp.response

data class WeatherResponse(
    val name: String,
    val main: MainFunctions,
    val weather: List<Weather>
)

data class MainFunctions(
    val temp: Float,
    val humidity: Int
)

data class Weather(
    val description: String,
)