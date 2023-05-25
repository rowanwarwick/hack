package com.example.kazan.data

import java.io.Serializable


data class Event(
    val image: String,
    val name: String,
    val date: String,
    val address: String
) : Serializable