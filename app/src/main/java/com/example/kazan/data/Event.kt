package com.example.kazan.data

import com.example.kazan.enums.TypeEvent
import java.io.Serializable


data class Event(
    val image: String,
    val name: String,
    val address: String,
    val date: String,
    val speakers: List<String>,
    val typeEvent : TypeEvent,
    val about : String,
    val webAddress : String,
    val favorite : Boolean
) : Serializable