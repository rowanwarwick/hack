package com.example.kazan.data

import java.io.Serializable

data class Courses(
    val image: Int,
    val date: String,
    val description: String,
    val speakersPhoto: List<Int>,
    val link: String
) : Serializable