package fr.efrei.JPAPJ.entity;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule {

    private int numberOfSeats;

    public Car(int i, int numberOfSeats) {
        super();
    }

    public Car(String PlateNumber, int numberOfSeats) {
        super();
       this.plateNumber=getPlateNumber();
       this.numberOfSeats = numberOfSeats;
    }

    public Car(String plateNumber, Rent rent, int numberOfSeats){
        super(plateNumber);
        this.numberOfSeats = numberOfSeats;
    }


    public String getPlateNumber() {
        return super.getPlateNumber();
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String s = ("PLATE NUMBER : "+ getPlateNumber() + "NUMBER OF SEAT " );
        return s;
    }
}