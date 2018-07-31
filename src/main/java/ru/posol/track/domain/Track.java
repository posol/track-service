package ru.posol.track.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Stores information about Track.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class Track {

    @Id
    @GeneratedValue
    @Column(name = "TRACK_ID")
    private Long id;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "TRACK_CAR",
            joinColumns = @JoinColumn(name = "TRACK_ID"),
            inverseJoinColumns = @JoinColumn(name = "CAR_ID")
    )
    private final List<Car> cars;

    private final String name;
    private final String description;
    private final Length length;

    Track() {
        name = null;
        description = null;
        length = null;
        cars = null;
    }

}
