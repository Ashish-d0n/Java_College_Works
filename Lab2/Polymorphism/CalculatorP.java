/* 
Implement a calculator program using polymorphism.
Create an interface Calculator with methods for addition, subtraction, 
multiplication, and division. Implement classes for basic and scientific 
calculators.
*/

import java.util.Scanner;


interface Calculator {
    void add(double a, double b);
    void subtract(double a, double b);
    void multiply(double a, double b);
    void divide(double a, double b);
}


class BasicCalculator implements Calculator {
    @Override
     public void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
     public void subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
     public void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
     public void divide(double a, double b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Error: Division by zero!");
    }
}


class ScientificCalculator implements Calculator {
    @Override
     public void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
     public void subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
     public void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
     public void divide(double a, double b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Error: Division by zero!");
    }

    
     void power(double base, double exp) {
        System.out.println("Power: " + Math.pow(base, exp));
    }

     void squareRoot(double num) {
        if (num >= 0)
            System.out.println("Square Root: " + Math.sqrt(num));
        else
            System.out.println("Error: Negative number!");
    }

     void sine(double angle) {
        System.out.println("Sine(" + angle + "°): " + Math.sin(Math.toRadians(angle)));
    }

     void cosine(double angle) {
        System.out.println("Cosine(" + angle + "°): " + Math.cos(Math.toRadians(angle)));
    }
}


public class CalculatorP{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double n1 = scn.nextDouble();
        double n2 = scn.nextDouble();

        System.out.println("\nChoose Calculator Type:");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        int type = scn.nextInt();

        Calculator calc; 

        if (type == 1) {
            calc = new BasicCalculator();
            System.out.println("\nChoose Operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                        calc.add(n1, n2);
                         break;
                case 2: 
                        calc.subtract(n1, n2);
                         break;
                case 3: 
                        calc.multiply(n1, n2);
                         break;
                case 4: 
                        calc.divide(n1, n2);
                         break;
                default:
                         System.out.println("Invalid choice!");
            }
        } else {
            calc = new ScientificCalculator();
            System.out.println("\nChoose Operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Power\n6. Square Root\n7. Sine\n8. Cosine");
            int choice = scn.nextInt();

            switch (choice) {
                case 1: 
                        calc.add(n1, n2);
                         break;
                case 2:
                        calc.subtract(n1, n2);
                         break;
                case 3: 
                        calc.multiply(n1, n2);
                         break;
                case 4: 
                        calc.divide(n1, n2);
                         break;
                case 5:
                        ((ScientificCalculator)calc).power(n1, n2);
                         break;
                case 6: 
                        ((ScientificCalculator)calc).squareRoot(n1);
                         break;
                case 7:
                        ((ScientificCalculator)calc).sine(n1);
                         break;
                case 8: 
                        ((ScientificCalculator)calc).cosine(n1);
                         break;
                default:
                         System.out.println("Invalid choice!");
            }
        }

        scn.close();
    }
}

