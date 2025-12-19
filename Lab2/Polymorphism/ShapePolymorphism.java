/* 
Modify the shape hierarchy from question 1 to demonstrate
polymorphism. Create an array of Shape objects and call their calculateArea() and
display() methods.
*/

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

public class ShapePolymorphism{

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

       
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        
        for (Shape s : shapes) {
            s.calculateArea(); 
            s.display();        
        }
    }
}

