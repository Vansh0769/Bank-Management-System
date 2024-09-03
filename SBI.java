package com.company;

public class SBI extends Bank {
    private double balance;

    @Override
    public void displayBankDetails() {
        System.out.println("You have chosen SBI (State Bank of India).");

    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

