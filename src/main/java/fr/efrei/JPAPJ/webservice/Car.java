package fr.efrei.JPAPJ.webservice;

import fr.efrei.JPAPJ.entity.Car;
import fr.efrei.JPAPJ.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Reprise de l'exemple sur github*/
@RestController
class RestWebServiceCar {

    CarRepository carRepository;

    @Autowired
    public RestWebServiceCar(CarRepository carRepository) {
        super();
        this.carRepository = carRepository;
    }

    @GetMapping("/Car")
    public Iterable<Car> getPlateNumber(){
        return carRepository.findAll();
    }

}
