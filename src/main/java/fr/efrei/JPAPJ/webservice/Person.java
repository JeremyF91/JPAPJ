package fr.efrei.JPAPJ.webservice;

import fr.efrei.JPAPJ.entity.Person;
import fr.efrei.JPAPJ.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Reprise de l'exemple sur github*/
@RestController
class RestWebServicePerson {

    PersonRepository personRepository;

    @Autowired
    public RestWebServicePerson(PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;
    }

    @GetMapping("/Person")
    public Iterable<Person> getId(){
        return personRepository.findAll();
    }

}
