package com.example.forecastmvvm.data.db.unitlocalized

data class ImperialCurrentWeatherEntry(
    override val temperature: Double,
    override val windSpeed: Double,
    override val windDirection: String,
    override val precipitationVolume: Double,
    override val feelsLikeTemperature: Double,
    override val visibilityDDistance: Double
) : UnitSpecificCurrentWeatherEntry