package fr.efrei.JPAPJ.webservice;

import fr.efrei.JPAPJ.entity.Rent;
import fr.efrei.JPAPJ.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Reprise de l'exemple sur github*/
@RestController
class RestWebServiceRent {

    RentRepository rentRepository;

    @Autowired
    public RestWebServiceRent(RentRepository rentRepository) {
        super();
        this.rentRepository = rentRepository;
    }

    @GetMapping("/Rent")
    public Iterable<Rent> getId(){
        return rentRepository.findAll();
    }

}
