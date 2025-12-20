/* 
Create a class Student with private data members for
name, roll number, and marks. Implement getter and setter methods for encapsulation.
*/

import java.util.Scanner;

class Student {
    private String name;
    private int rollno;
    private float marks;

   
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }

    
    public int getRoll() {
        return rollno;
    }
    public void setRoll(int r) {
        this.rollno = r;
    }

   
    public float getMarks() {
        return marks;
    }
    public void setMarks(float m) {
        this.marks = m;
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter the student name: ");
        s.setName(scn.nextLine());   

        System.out.print("Enter the student roll no: ");
        s.setRoll(scn.nextInt());   

        System.out.print("Enter the student marks: ");
        s.setMarks(scn.nextFloat());

        System.out.println("\n------ Student Information --------");
        System.out.println("Name: " + s.getName());       
        System.out.println("Roll Number: " + s.getRoll());
        System.out.println("Marks: " + s.getMarks());

        scn.close();
    }
}