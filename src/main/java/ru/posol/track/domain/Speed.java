package ru.posol.track.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class Speed {

    private final String unit;
    private final Double value;

    Speed() {
        unit = null;
        value = null;
    }
}
