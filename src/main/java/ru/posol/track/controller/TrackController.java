package ru.posol.track.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.posol.track.domain.Track;
import ru.posol.track.domain.TrackCollection;
import ru.posol.track.service.TrackService;

import java.util.List;

/**
 * This class provides a REST API to POST and GET the tracks
 */
@Slf4j
@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackService trackService;
    private final int serverPort;

    @Autowired
    public TrackController(final TrackService trackService, @Value("${server.port}") int serverPort) {
        this.trackService = trackService;
        this.serverPort = serverPort;
    }

    @PostMapping
    ResponseEntity<TrackCollection> postTrack(final @RequestBody TrackCollection trackCollection) {
        log.info("Sending track {} on server @ {}", trackCollection, serverPort);
        return ResponseEntity.ok(trackService.createTracks(trackCollection));
    }

    @GetMapping
    ResponseEntity<List<Track>> getTracs() {
        return ResponseEntity.ok(trackService.getAllTracks());
    }

}
