package com.musicplayerreactive.musicplayerreactive.model
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.sql.Date

@Table(name = "songs")
class MusicPlayerModel(
    @Id
    val id: Int?,
    val name: String,
    val composer: String,
    val language: String,
    val release_date: Date,
) {
}
