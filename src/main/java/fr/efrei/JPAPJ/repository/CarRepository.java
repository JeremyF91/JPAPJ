package fr.efrei.JPAPJ.repository;

import fr.efrei.JPAPJ.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByPlateNumber(String PlateNumber);
}

