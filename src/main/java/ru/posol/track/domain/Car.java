package ru.posol.track.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Stores information about Car.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class Car {

    @Id
    @GeneratedValue
    @Column(name = "CAR_ID")
    private Long id;

    private final String code;
    private final String transmission;
    private final String ai;
    @JsonProperty("max-speed")
    private final Speed maxSpeed;

    Car() {
        code = null;
        transmission = null;
        ai = null;
        maxSpeed = null;
    }

}
