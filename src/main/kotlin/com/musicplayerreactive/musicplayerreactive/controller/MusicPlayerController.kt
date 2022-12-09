package com.musicplayerreactive.musicplayerreactive.controller

import com.musicplayerreactive.musicplayerreactive.model.MusicPlayerModel
import com.musicplayerreactive.musicplayerreactive.services.MusicPlayerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/songs")
class MusicPlayerController(val musicPlayerService: MusicPlayerService) {

    @GetMapping
    fun getAllSongs(): Flux<MusicPlayerModel> {
        return musicPlayerService.getAllSongs()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveSong(@RequestBody song: MusicPlayerModel){

    }
}
