package fr.efrei.JPAPJ.entity;

import org.springframework.lang.NonNull;
import javax.persistence.*;

@Entity
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    String plateNumber;

    public Vehicule(String plateNumber) {
        super();
    }

    public Vehicule(long id, String plateNumber){
        super();
        this.id=id;
        this.plateNumber= plateNumber;
    }

    public Vehicule() {
        super();
    }

    public Vehicule(String plateNumber, Rent rent) {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id ){this.id = id;}

    public String getPlateNumber() {
        return getPlateNumber();
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }


}