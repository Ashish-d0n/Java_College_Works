/* Wap to find the maximum and minimum values in array */
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }

       
        int max = array[0];
        int min = array[0];

       
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The maximum value of array is: " + max);
        System.out.println("The minimum value of array is: " + min);

        scn.close();
    }
}