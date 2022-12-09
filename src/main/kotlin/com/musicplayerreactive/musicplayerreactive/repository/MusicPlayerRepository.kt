package com.musicplayerreactive.musicplayerreactive.repository
import com.musicplayerreactive.musicplayerreactive.model.MusicPlayerModel
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MusicPlayerRepository : ReactiveCrudRepository <MusicPlayerModel, Int> {

}