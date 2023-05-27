package com.example.kazan.data

import java.io.Serializable

data class Startup(
    val image: String,
    val name: String,
    val creator: String,
    val link: String
) : Serializable
