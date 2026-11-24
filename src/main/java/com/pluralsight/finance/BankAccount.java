package com.pluralsight.finance;

public interface BankAccount extends Valuable{
    public void deposit(double amount);
    public double withdraw(double amount);
    public double getBalance();
}
