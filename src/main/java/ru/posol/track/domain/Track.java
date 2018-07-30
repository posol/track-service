package ru.posol.track.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    @Column(name = "USER_ID")
    private Long id;

    private final String name;

    // Empty constructor for JSON/JPA
    protected Track() {
        name = null;
    }

}
