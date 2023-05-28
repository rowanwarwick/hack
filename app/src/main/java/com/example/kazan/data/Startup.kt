package com.example.kazan.data

import java.io.Serializable

data class Startup(
    val image: Int,
    val name: String,
    val creator: String,
    val link: String,
    val typeOfStartup: String,
    val aboutTheProject: String,
    val DescriptionAboutProjects: String,
    val investStage: String,
    val sum: String,
    val basedImages: List<Int>,
    val isFavorite : Boolean
) : Serializable
