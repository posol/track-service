package ru.posol.track.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.posol.track.repository.CarRepository;
import ru.posol.track.repository.TrackRepository;

public class TrackServiceImplTest {

    private TrackServiceImpl trackServiceImpl;

    @Mock
    private TrackRepository trackRepository;

    @Mock
    private CarRepository carRepository;

    @Before
    public void setUp() {
        // With this call to initMocks we tell Mockito to process the annotations
        MockitoAnnotations.initMocks(this);
        trackServiceImpl = new TrackServiceImpl(trackRepository);
    }

    @Test
    public void createTrackTest() {
        //FIXME подумтаь как лучше тестировать
    }


    @Test
    public void retrieveAllTracksTest() {

    }

}
