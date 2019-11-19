package fr.efrei.JPAPJ.repository;

import fr.efrei.JPAPJ.entity.Vehicule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
    Vehicule findByPlateNumber(String plateNumber);
}

