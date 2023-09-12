package com.ivanojok.weatherforecast.data

data class WeatherResponse(
    var coord:Coord,
    var weather: List<Weather>,
    var base:String,
    var main:Main,
    var visibility:Long,
    var dt:Long,
)

data class Coord(
    var lon:Double,
    var lat:Double
)

data class Weather(
    var id:Long,
    var main:String,
    var description:String,
    var icon:String
)

data class Main(
    var temp:Double
)

//{
//
//    "base": "stations",
//    "main": {
//    "temp": 296.82,
//    "feels_like": 296.81,
//    "temp_min": 296.82,
//    "temp_max": 296.82,
//    "pressure": 1011,
//    "humidity": 60,
//    "sea_level": 1011,
//    "grnd_level": 861
//},
//    "visibility": 10000,
//    "wind": {
//    "speed": 3.47,
//    "deg": 23,
//    "gust": 5.06
//},
//    "rain": {
//    "1h": 0.36
//},
//    "clouds": {
//    "all": 88
//},
//    "dt": 1694530991,
//    "sys": {
//    "country": "UG",
//    "sunrise": 1694490653,
//    "sunset": 1694534230
//},
//    "timezone": 10800,
//    "id": 229268,
//    "name": "Mbarara",
//    "cod": 200
//}