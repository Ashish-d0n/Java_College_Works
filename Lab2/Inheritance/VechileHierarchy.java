/* 
Create a class hierarchy for vehicles. Implement a base class Vehicle
and subclasses Car and Motorcycle with specific attributes and methods.
*/

import java.util.Scanner;


class Vehicle {
    String name;
    double cost;
    Scanner scn = new Scanner(System.in);
}


class Car extends Vehicle {

    void inputDetails() {
        System.out.print("Enter the brand of the car: ");
        name = scn.next();

        System.out.print("Enter the price of the car: ");
        cost = scn.nextDouble();
    }

    void displayDetails() {
        System.out.println("Car Brand: " + name);
        System.out.println("Car Price: " + cost);
    }
}


class Motorcycle extends Vehicle {

    void inputDetails() {
        System.out.print("Enter the brand of the motorcycle: ");
        name = scn.next();

        System.out.print("Enter the price of the motorcycle: ");
        cost = scn.nextDouble();
    }

    void displayDetails() {
        System.out.println("Motorcycle Brand: " + name);
        System.out.println("Motorcycle Price: " + cost);
    }
}


public class VechileHierarchy {
    public static void main(String[] args) {

        Car car = new Car();
        car.inputDetails();
        car.displayDetails();

        System.out.println();

        Motorcycle bike = new Motorcycle();
        bike.inputDetails();
        bike.displayDetails();
    }
}
