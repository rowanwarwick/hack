package com.example.kazan.data

import com.example.kazan.enums.TypeEvent
import java.io.Serializable


data class Event(
    val image: Int,
    val name: String,
    val date: String,
    val address: String,
    val speakers: List<Int>,
    val typeEvent : String,
    val about : String,
    val webAddress : String,
    val favorite : Boolean
) : Serializable