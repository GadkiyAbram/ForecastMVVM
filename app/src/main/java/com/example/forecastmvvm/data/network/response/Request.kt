package com.example.forecastmvvm.data.network.response


data class Request(
    val language: String,
    val query: String,
    val type: String,
    val unit: String
)