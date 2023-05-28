package com.example.kazan.data

import java.io.Serializable

data class SupportMeasures(
    val image: Int,
    val name: String,
    val description: String,
    val link: String
): Serializable