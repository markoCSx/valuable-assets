package com.pluralsight.finance;

public class Main {

    public static void main(String[] args) {
        Portfolio myPortfolio = new Portfolio();

        myPortfolio.addValuable(new CheckingAccount(200));
        myPortfolio.addValuable(new CheckingAccount(100));
        myPortfolio.addValuable(new SavingsAccount(500));

        myPortfolio.addValuable(new Truck("F150", 60_000, 5_000, 20));
        myPortfolio.addValuable(new Car("Ferrari", 120_000, 6_000));

        // Should print: I'm worth: 180800.0
        System.out.println("I'm worth: " + myPortfolio.getValue());
    }
}
