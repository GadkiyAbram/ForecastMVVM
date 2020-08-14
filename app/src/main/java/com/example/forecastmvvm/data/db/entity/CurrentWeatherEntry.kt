package com.example.forecastmvvm.data.db.entity


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(
    @SerializedName("feelslike")
    val feelsLikeTemperature: Double,
    @SerializedName("is_day")
    val isDay: String,
    @SerializedName("precip")
    val precipitationVolume: Double,
    @SerializedName("temperature")
    val temperature: Double,
    @SerializedName("visibility")
    val visibilityDistance: Double,
    @SerializedName("weather_code")
    val weatherCode: Int,
    @SerializedName("wind_degree")
    val windDirection: String,
    @SerializedName("wind_speed")
    val windSpeed: Double
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}