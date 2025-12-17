/*
Design an abstract class BankAccount with methods for deposit, withdrawal, and 
display balance. Implement two subclasses for savings and checking accounts. 
 */

import java.util.Scanner;


abstract class BankAccount {
    double balance = 0;   
    Scanner scn = new Scanner(System.in);

    abstract void deposit();
    abstract void withdrawal();
    abstract void display();
}


class Saving extends BankAccount {

    void deposit() {
        System.out.println("How much money do you want to deposit Sir/Mam?");
        double amount = scn.nextDouble();
        balance += amount;
    }

    void withdrawal() {
        System.out.println("How much money do you want to withdraw Sir/Mam?");
        double amount = scn.nextDouble();

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance Sir/Mam");
        }
    }

    void display() {
        System.out.println("Your Savings Account Balance is: " + balance + " Sir/Mam");
    }
}


class Checking extends BankAccount {

    void deposit() {
        System.out.println("How much money do you want to deposit Sir/Mam?");
        double amount = scn.nextDouble();
        balance += amount;
    }

    void withdrawal() {
        System.out.println("How much money do you want to withdraw Sir/Mam?");
        double amount = scn.nextDouble();

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance Sir/Mam");
        }
    }

    void display() {
        System.out.println("Your Checking Account Balance is: " + balance + " Sir/Mam");
    }
}


public class BankAccountAbstraction {

    public static void main(String[] args) {

        BankAccount b;

        b = new Saving();
        b.deposit();
        b.withdrawal();
        b.display();

        System.out.println("For Checking :");

        b = new Checking();
        b.deposit();
        b.withdrawal();
        b.display();
    }
}
