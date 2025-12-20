/* 
Create a class with a final method. Try to override this method in a
subclass and observe the result.
*/

class Student {
    private final String name;
    private final int roll;

    public Student(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public final void displayInfo()
    {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

class CollegeStudent extends Student {
    public CollegeStudent(String name, int roll)
    {
        super(name, roll);
    }

    // Cannot override final method
    /* 
    
    @Override
    public void displayInfo()
    {
    System.out.println("Overridden method in CollegeStudent");
    }
    */
    
    public void showCollege()
    {
        System.out.println("This student is student of GCES.");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent("Ashish", 10);
        cs.displayInfo();   
        cs.showCollege();    
    }
}