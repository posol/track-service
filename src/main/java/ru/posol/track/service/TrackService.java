package ru.posol.track.service;

import ru.posol.track.domain.Track;
import ru.posol.track.domain.TrackCollection;

import java.util.List;

public interface TrackService {

    /**
     * create tracks
     *
     * @return
     */
    TrackCollection createTracks(TrackCollection trackCollection);

    /**
     * get tracks
     *
     * @return
     */
    List<Track> getAllTracks();

}
