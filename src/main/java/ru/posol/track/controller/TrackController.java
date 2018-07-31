package ru.posol.track.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.posol.track.domain.Track;
import ru.posol.track.service.TrackService;

import java.util.List;

/**
 * This class provides a REST API to POST and GET the tracks
 */
@Slf4j
@RestController
@RequestMapping("/tracks")
public class TrackController {

    private final TrackService trackService;

    private final int serverPort;

    @Autowired
    public TrackController(final TrackService trackService, @Value("${server.port}") int serverPort) {
        this.trackService = trackService;
        this.serverPort = serverPort;
    }

    @PostMapping
    ResponseEntity<Track> postTrack(final @RequestBody Track track) {
        log.info("Sending track {} on server @ {}", track, serverPort);
        return ResponseEntity.ok(trackService.createTrack(track));
    }
    в обоих методах на вход и на выход должен быть врапер над треком - как в примере с жейсоном
    @GetMapping
    ResponseEntity<List<Track>> getTracs() {
        return ResponseEntity.ok(trackService.getAllTracks());
    }


}
