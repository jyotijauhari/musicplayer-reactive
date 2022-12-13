package com.musicplayerreactive.musicplayerreactive.model
import java.time.LocalDate

data class SongRequest(
    val name: String,
    val composer: String,
    val language: String,
    val release_date: LocalDate,
)
