package ru.posol.track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.posol.track.domain.Track;
import ru.posol.track.domain.TrackCollection;
import ru.posol.track.repository.TrackRepository;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Transactional
    @Override
    public TrackCollection createTracks(TrackCollection trackCollection) {

        Assert.notNull(trackCollection,"incorrect data");
        Assert.notNull(trackCollection.getTracks(),"incorrect data");

        trackCollection.getTracks().stream()
                .map(track -> trackRepository.save(track))
                .collect(Collectors.toList());

        return  trackCollection;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }
}
