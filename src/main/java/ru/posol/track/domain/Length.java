package ru.posol.track.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class Length {

    private final String unit;
    private final double value;

    Length() {
        unit = null;
        value = 0;
    }
}
