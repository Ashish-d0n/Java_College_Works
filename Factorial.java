/* WAP to find the factorial of a number */


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, f = 1, n;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = scn.nextInt();

        for (i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("The Factorial of " + n + " is: " + f);
        scn.close();
    }
}
