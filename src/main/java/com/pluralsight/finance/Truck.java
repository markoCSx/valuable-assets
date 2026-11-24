package com.pluralsight.finance;

public class Truck extends Vehicle{
    private int cargoTons;

    public Truck(String makeModel, double initialCost, int initialMileage, int cargoTons) {
        super(makeModel, initialCost, initialMileage);
        this.cargoTons = cargoTons;
    }

}
