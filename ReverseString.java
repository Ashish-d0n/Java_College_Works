/* Wap to reverse a string */

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scn.nextLine();   

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}