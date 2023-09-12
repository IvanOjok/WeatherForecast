package com.ivanojok.weatherforecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ivanojok.weatherforecast.data.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val service = RetrofitInstance().createRetrofit()
            val apiResponse = service.getWeather("Kampala", "af1227096ce748ee75e89dab8adc9a36")

            withContext(Dispatchers.Main) {
                val textview = findViewById<TextView>(R.id.response)
                //textview.text = apiResponse.weather[0].description
                textview.text = apiResponse.toString()
            }
        }

    }
}