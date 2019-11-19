package fr.efrei.JPAPJ.webservice;

import fr.efrei.JPAPJ.entity.Vehicule;
import fr.efrei.JPAPJ.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Reprise de l'exemple sur github */
@RestController
class RestWebServiceVehicule {

    VehiculeRepository vehiculeRepository;

    @Autowired
    public RestWebServiceVehicule(VehiculeRepository vehiculeRepository) {
        super();
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping("/vehicule")
    public Iterable<Vehicule> getPlateNumber(){
        return vehiculeRepository.findAll();
    }

}
