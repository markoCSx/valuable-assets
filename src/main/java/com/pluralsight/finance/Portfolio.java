package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio implements Valuable{
    private ArrayList<Valuable> valuables;

    public Portfolio() {
        this.valuables = new ArrayList<>();
    }

    public void addValuable(Valuable valuable) {
        this.valuables.add(valuable);
    }

    public double getValue(){
        double totalValue = 0;
        for (Valuable currentValuable : valuables) {
            totalValue += currentValuable.getValue();
        }
        return totalValue;
    }

    public ArrayList<Truck> getTrucks () {
        ArrayList<Truck> trucks = new ArrayList<>();
        for (Valuable currentValuable : valuables) {
            if(currentValuable instanceof Truck) {
                trucks.add((Truck) currentValuable);
            }
        }
        return trucks;
    }
}
