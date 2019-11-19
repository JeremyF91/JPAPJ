package fr.efrei.JPAPJ.entity;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule {

    private double maxWeight;

    protected Van() {
        super();
    }
    public Van(String plateNumber, double mexWeight) {
        super(plateNumber);
    }
    public Van(String plateNumber, Rent rent, double mexWeight) {
        super(plateNumber, rent);
    }

    public double getMaxWeight()
    {
        return maxWeight;
    }
    public void setMaxWeight(double maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return null;
    }
}