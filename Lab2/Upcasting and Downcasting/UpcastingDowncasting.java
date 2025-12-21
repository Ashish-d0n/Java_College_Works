/* 
Demonstrate upcasting by creating an object of a subclass and
assigning it to a reference variable of the superclass type.
*/

class Parent
{

    void display1()
    {
        System.out.println("THis is Parent Class. \n");
    }
}

class Child extends Parent
{

    void display2()
    {
        System.out.println("THis is Child Class. \n");
    }


}

public class UpcastingDowncasting
{
    public static void main(String[] args)
    {

        Parent obj=new Child();
        obj.display1();

        Child obj1=(Child) obj;
        obj1.display2();

    }
}