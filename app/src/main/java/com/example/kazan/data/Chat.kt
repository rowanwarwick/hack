package com.example.kazan.data

import java.io.Serializable

data class Chat(
    val image: Int,
    val name: String,
    val message: MutableList<Triple<String, String, Boolean>>,
    val newMessage: Boolean
) : Serializable
