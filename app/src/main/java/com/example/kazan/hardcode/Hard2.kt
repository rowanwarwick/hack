package com.example.kazan.hardcode

import com.example.kazan.data.Chat

val chatList = listOf(
    Chat(
        1,
        "Leonid",
        mutableListOf(
            Triple("20:13", "Whats up", true),
            Triple("20:13", "Whats up", false),
            Triple("20:13", "Whats up", true)
        ),
        true
    ),
    Chat(
        1,
        "Maksim",
        mutableListOf(
            Triple("06:33", "Whats up", false),
            Triple("20:13", "Whats up", true),
            Triple("20:13", "Whats up", false)
        ),
        false
    )
)