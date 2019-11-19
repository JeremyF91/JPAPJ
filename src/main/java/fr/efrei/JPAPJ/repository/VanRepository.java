package fr.efrei.JPAPJ.repository;

import fr.efrei.JPAPJ.entity.Van;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface VanRepository extends CrudRepository<Van, Long> {
    List<Van> findByPlateNumber(String PlateNumber);
}

