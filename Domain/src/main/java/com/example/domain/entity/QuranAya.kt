package com.example.domain.entity

data class QuranAya(
    val id: Int,
    val number: Int,
    val sorahNumber: Int,
    val jozaNumber: Int,
    val content: String,
    val contentWithTashkel: String
)
