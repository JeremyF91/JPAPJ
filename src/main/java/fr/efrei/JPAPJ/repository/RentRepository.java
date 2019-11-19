package fr.efrei.JPAPJ.repository;

import fr.efrei.JPAPJ.entity.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
    Rent findById(int Id);
}

