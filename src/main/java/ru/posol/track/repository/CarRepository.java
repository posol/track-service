package ru.posol.track.repository;

import org.springframework.data.repository.CrudRepository;
import ru.posol.track.domain.Car;
import ru.posol.track.domain.Track;

import java.util.Optional;

/**
 * This interface allows us to save and retrieve Cars
 */
public interface CarRepository extends CrudRepository<Car, Long> {

    Optional<Car> findByCode(final String code);

}
