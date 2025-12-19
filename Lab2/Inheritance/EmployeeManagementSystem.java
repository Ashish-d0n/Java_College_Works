/* 
Design a class hierarchy for an employee management system with a base 
class Employee and subclasses for different types of employees (e.g.,full-time,
 part-time) and implement the calculation of salary based on the hours work:
full-time: 40hrs, part-time 20hrs a week.
 */

import java.util.Scanner;

class Employee
{
    String name;
    double salary,rate;
    Scanner scn=new Scanner(System.in);
}
class FullTime extends Employee
{
    void getInput()
    {
        System.out.println("Enter the name of the employee:");
        name=scn.nextLine();
        System.out.println("\n Enter the rate per hour : ");
        rate=scn.nextDouble();
    }

    void display()
    {
        salary=40*rate;
        System.out.println("\n The Salary of the employee "+name+" is: "+salary);
    }

}
class PartTime extends Employee
{
    void getInput()
    {
        System.out.println("\nEnter the name of the employee:");
        name=scn.nextLine();
        System.out.println("\n Enter the rate per hour : ");
        rate=scn.nextDouble();
    }

    void display()
    {
        salary=20*rate;
        System.out.println("\n The Salary of the employee "+name+" is: "+salary);
    }
}

public class EmployeeManagementSystem
{

    public static void main(String[] args)
    {
        FullTime ft=new FullTime();
        ft.getInput();
        ft.display();

        PartTime pt=new PartTime();
        pt.getInput();
        pt.display();

        

    }
}

