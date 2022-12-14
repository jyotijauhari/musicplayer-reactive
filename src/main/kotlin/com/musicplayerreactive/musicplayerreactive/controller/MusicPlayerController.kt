package com.musicplayerreactive.musicplayerreactive.controller

import com.musicplayerreactive.musicplayerreactive.model.MusicPlayerModel
import com.musicplayerreactive.musicplayerreactive.model.SongRequest
import com.musicplayerreactive.musicplayerreactive.services.MusicPlayerService
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

    @PostMapping
    fun save(@Valid @RequestBody songRequest: SongRequest): Mono<MusicPlayerModel> {
        return musicPlayerService.save(songRequest)
    }

}
