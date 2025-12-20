/* 
Create a program that reads data from a file
and handles FileNotFoundException. Use a try-catch block to manage potential errors.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            
            File file = new File("data.txt"); 
            
            
            Scanner scn = new Scanner(file);
            
           
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                System.out.println(line);
            }
            
            scn.close(); 
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: File not found. Please check the filename.");
        }
    }
}