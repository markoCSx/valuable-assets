package com.pluralsight.finance;

public class Vehicle implements Valuable{
    private String makeModel;
    private double initialCost;
    private int initialMileage;
    private int currentMileage;
    public static double DEPRECIATION_PER_MILE = 0.05;

    public Vehicle(String makeModel, Double initialCost, int initialMileage) {
        this.makeModel = makeModel;
        this.initialCost = initialCost;
        this.initialMileage = initialMileage;
        this.currentMileage = initialMileage;
    }

    public void drive(int miles) {
        this.currentMileage += miles;
    }

    @Override
    public double getValue() {
        double mileageDepreciation = (this.currentMileage - this.initialMileage) * DEPRECIATION_PER_MILE;
        return initialCost - mileageDepreciation;
    }
}
