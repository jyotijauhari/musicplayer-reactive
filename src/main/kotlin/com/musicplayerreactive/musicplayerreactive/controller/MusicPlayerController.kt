package com.musicplayerreactive.musicplayerreactive.controller

import com.musicplayerreactive.musicplayerreactive.model.MusicPlayerModel
import com.musicplayerreactive.musicplayerreactive.model.SongRequest
import com.musicplayerreactive.musicplayerreactive.services.MusicPlayerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/songs")
class MusicPlayerController(val musicPlayerService: MusicPlayerService) {

    @GetMapping
    fun getAllSongs(): Flux<MusicPlayerModel> {
        return musicPlayerService.getAllSongs()
    }

    @GetMapping("/{id}")
    fun findSongById(@PathVariable id:Int): Mono<MusicPlayerModel> {
        return musicPlayerService.findById(id)
    }

    @PostMapping
    fun save(@Valid @RequestBody songRequest: SongRequest): Mono<MusicPlayerModel> {
        return musicPlayerService.save(songRequest)
    }

    @PutMapping("/{id}")
    fun updateSong(@Valid @RequestBody songRequest: SongRequest, @PathVariable id:Int): Mono<MusicPlayerModel>{
        return musicPlayerService.updateSong(id, songRequest)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteSong(@PathVariable id:Int): Mono<Void>{
        return musicPlayerService.deleteSong(id)
    }

}
