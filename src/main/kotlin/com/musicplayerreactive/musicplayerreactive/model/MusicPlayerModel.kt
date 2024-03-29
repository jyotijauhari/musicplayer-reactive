package com.musicplayerreactive.musicplayerreactive.model
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table(name = "songs")
data class MusicPlayerModel(
    @Id
    val id: Int?=null,
    val name: String,
    val composer: String,
    val language: String,
    val release_date: LocalDate,
)
