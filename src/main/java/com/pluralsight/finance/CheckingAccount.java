package com.pluralsight.finance;

public class CheckingAccount extends BankAccount{
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
