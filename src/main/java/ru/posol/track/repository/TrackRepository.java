package ru.posol.track.repository;

import org.springframework.data.repository.CrudRepository;
import ru.posol.track.domain.Track;

import java.util.List;
import java.util.Optional;

/**
 * This interface allows us to save and retrieve Tracks
 */
public interface TrackRepository extends CrudRepository<Track, Long> {

    List<Track> findAll();

    Optional<Track> findByName(final String name);

}

