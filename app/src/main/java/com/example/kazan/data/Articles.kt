package com.example.kazan.data

import java.io.Serializable

data class Articles (
    val image: Int,
    val date: String,
    val description: String,
    val photoAuthors: List<Int>,
    val link: String
): Serializable