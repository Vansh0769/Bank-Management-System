package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        URLConn obj = new URLConn();
//        obj.connectUrl();
        Assignment asg = new Assignment();
        asg.connect();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Bank Management System");
        System.out.println("Choose a bank:");
        System.out.println("1. PNB");
        System.out.println("2. SBI");
        System.out.println("3. ICICI");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        Bank bank = null;
        switch (choice) {
            case 1:
                bank = new PNB();
                break;
            case 2:
                bank = new SBI();
                break;
            case 3:
                bank = new ICICI();
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 3.");
                break;
        }
        if (bank != null) {
            bank.displayBankDetails();
            boolean exit = false;
            while (!exit) {
                System.out.println("\nChoose a service:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");

                int serviceChoice = sc.nextInt();
                switch (serviceChoice) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        bank.withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        bank.deposit(depositAmount);
                        break;
                    case 3:
                        double balance = bank.getBalance();
                        System.out.println("Your balance is: " + balance);
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number between 1 and 4.");
                        break;
                }
            }
        }
    }
}






/*Bank Management system
Choosing the bank name
Bank Services------------- Withdrawl,Deposite,Balance
Money Manage-


class PNB{}
class SBI{}
class ICICI{}
 */