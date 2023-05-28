package com.example.kazan.data

import java.io.Serializable

data class Man(
    val name: String,
    val image: Int,
    val tagsPerson: List<String>,
    val role: String,
    val about : String,
    val investmentSize : String,
    val investmentStage : List<String>,
    val isFavorite : Boolean,
    val isInvestor : Boolean
) : Serializable
