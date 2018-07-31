package ru.posol.track.service;

import ru.posol.track.domain.Track;

import java.util.List;

public interface TrackService {

    /**
     * create track
     *
     * @return
     */
    Track createTrack(Track track);

    /**
     * get tracks
     *
     * @return
     */
    List<Track> getAllTracks();

}
