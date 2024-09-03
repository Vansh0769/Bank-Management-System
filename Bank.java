package com.company;

public abstract class Bank {
    abstract void displayBankDetails();
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract double getBalance();
}
