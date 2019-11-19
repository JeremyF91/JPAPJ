package fr.efrei.JPAPJ.webservice;

import fr.efrei.JPAPJ.entity.Van;
import fr.efrei.JPAPJ.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Reprise de l'exemple sur github*/
@RestController
class RestWebServiceVan {

    VanRepository vanRepository;

    @Autowired
    public RestWebServiceVan(VanRepository vanRepository) {
        super();
        this.vanRepository = vanRepository;
    }

    @GetMapping("/Van")
    public Iterable<Van> getPlateNumber(){
        return vanRepository.findAll();
    }

}
