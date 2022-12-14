package com.musicplayerreactive.musicplayerreactive.services
import NotFoundException
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

    fun updateSong(id: Int, songRequest: SongRequest): Mono<MusicPlayerModel> {
        return findById(id)
            .flatMap { song ->
                repository.save(
                    MusicPlayerModel(
                        id = id,
                        name = songRequest.name,
                        composer = songRequest.composer,
                        language = songRequest.language,
                        release_date = songRequest.release_date
                    )
                )
            }
    }

    fun findById(id: Int): Mono<MusicPlayerModel> {
        return repository.findById(id)
            .switchIfEmpty(
                Mono.error(
                    NotFoundException("song with id $id not found")
                )
            )
    }

    fun deleteSong(id: Int): Mono<Void> {
        return repository.findById(id)
            .flatMap { song ->
                repository.deleteById(id
                )
            }
    }

}

