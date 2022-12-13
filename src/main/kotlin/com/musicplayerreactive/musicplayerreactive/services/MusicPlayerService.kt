package com.musicplayerreactive.musicplayerreactive.services
import com.musicplayerreactive.musicplayerreactive.model.MusicPlayerModel
import com.musicplayerreactive.musicplayerreactive.model.SongRequest
import com.musicplayerreactive.musicplayerreactive.repository.MusicPlayerRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class MusicPlayerService(val repository: MusicPlayerRepository) {

    fun getAllSongs(): Flux<MusicPlayerModel> {
        return repository.findAll()
    }

    fun save(songRequest: SongRequest): Mono<MusicPlayerModel> {
        return repository.save(
            MusicPlayerModel(
                name = songRequest.name,
                composer = songRequest.composer,
                language = songRequest.language,
                release_date = songRequest.release_date
            )
        )
    }


}

