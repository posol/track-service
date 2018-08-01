package ru.posol.track.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class TrackCollection {

    private final List<Track> tracks;

    TrackCollection() {
        tracks = null;
    }
}
