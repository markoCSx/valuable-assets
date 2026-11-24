package com.pluralsight.finance;

public abstract class BankAccount implements Valuable{
    public abstract void deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract double getBalance();
}
