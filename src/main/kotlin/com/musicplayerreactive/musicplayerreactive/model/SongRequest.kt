package com.musicplayerreactive.musicplayerreactive.model
import org.jetbrains.annotations.NotNull
import java.time.LocalDate
import javax.validation.constraints.NotBlank

data class SongRequest(
    @field:NotBlank val name: String,
    @field:NotBlank val composer: String,
    @field:NotBlank val language: String,
    val release_date: LocalDate,
)
