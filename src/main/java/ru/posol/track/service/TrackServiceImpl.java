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
        //FIXME проверить есть ли такой трек в бд(кары тоже проверять?)
        //трек по имени тачку по коду проверять(соответсвенно ограниченя на уровень бд надо?)
        //FIXME не понятно если придет существующий трек надо ли кары перепривязать ну думаю да
        //FIXME в задании сказано только СОХРАНЯТЬ!!! не надо никаких проверок и валидаций
        // Check if the user already exists for that alias
        //Optional<Track> track = trackRepository.findByName(newTrack.getName());

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
