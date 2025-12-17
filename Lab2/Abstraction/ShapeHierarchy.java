/* 
Create an abstract class Shape with abstract methods calculateArea()
and display(). Implement concrete classes Circle and Rectangle inheriting from Shape
with their own implementations. */

import java.util.Scanner;


 abstract class Shape {
    float r, l, b, Area;
    Scanner scn = new Scanner(System.in);

    abstract void calculateArea();
    abstract void display();
}


class Circle extends Shape {
    void calculateArea() {
        System.out.println("Enter the value of radius:");
        r = scn.nextFloat();
        Area = 3.14f * r * r;
    }

    void display() {
        System.out.println("\nThe area of a circle with radius " + r + " is: " + Area);
    }
}


class Rectangle extends Shape {
    void calculateArea() {
        System.out.println("\nEnter the value of length and breadth:");
        l = scn.nextFloat();
        b = scn.nextFloat();
        Area = l * b;
    }

    void display() {
        System.out.println("\nThe area of a rectangle with length " + l + " and breadth " + b + " is: " + Area);
    }

    
}

public class ShapeHierarchy{

    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.calculateArea();
        s.display();

        s = new Rectangle();
        s.calculateArea();
        s.display();
    }
}