package com.musicplayerreactive.musicplayerreactive.services
import com.musicplayerreactive.musicplayerreactive.model.MusicPlayerModel
import com.musicplayerreactive.musicplayerreactive.repository.MusicPlayerRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class MusicPlayerService(val repository: MusicPlayerRepository) {

    fun getAllSongs(): Flux<MusicPlayerModel> {
        return repository.findAll()
    }


}

