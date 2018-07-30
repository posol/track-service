package ru.posol.track.repository;

import org.springframework.data.repository.CrudRepository;
import ru.posol.track.domain.Track;

/**
 * This interface allows us to save and retrieve Tracks
 */
public interface TrackRepository extends CrudRepository<Track, Long> {
}

