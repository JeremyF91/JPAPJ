package fr.efrei.JPAPJ.repository;

import fr.efrei.JPAPJ.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findById(int Id);
}

