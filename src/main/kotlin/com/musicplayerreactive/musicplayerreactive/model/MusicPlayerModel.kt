package com.musicplayerreactive.musicplayerreactive.model
import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table(name = "songs")
class MusicPlayerModel(
    @Id
    val id: Int?,
    val name: String,
    val composer: String,
    val language: String,
    @field:JsonFormat(pattern = "yyyy-MM-dd")
    val releaseDate: Date,
) {
}
