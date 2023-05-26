package com.example.kazan.data

import java.io.Serializable

data class Man(
    val name: String,
    val image: String,
    val tagsPerson: List<String>,
    val role: String
) : Serializable
