package com.corejava.oops.encapsulation;

/*
In this example, we encapsulate the accountNumber and balance attributes by making them private.
We provide public methods deposit(), withdraw(), and getBalance() to interact with these attributes
 in a controlled manner.
 */

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
}