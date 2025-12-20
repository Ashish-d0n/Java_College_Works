/* 
Write a program that takes two numbers as input
and performs division. Handle the ArithmeticException if the denominator is zero.
*/

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int x, y;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        x = scn.nextInt();

        System.out.println("Enter the denominator: ");
        y = scn.nextInt();

        try {
            int result = x / y;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scn.close();
    }
}