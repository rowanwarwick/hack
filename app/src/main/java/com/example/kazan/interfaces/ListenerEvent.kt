package com.example.kazan.interfaces

import com.example.kazan.data.Event

interface ListenerEvent {
    fun onClick(event: Event)
}