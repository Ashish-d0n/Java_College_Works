/* 
Create an array of the base class type and fill it with objects of
different subclasses. Use polymorphism to call methods on each object.
*/


interface Superclass {
    void display(); 
}

class Subclass1 implements Superclass {
    @Override
    public void display() {
        System.out.println("I am Subclass1");
    }
}

class Subclass2 implements Superclass {
    @Override
    public void display() {
        System.out.println("I am Subclass2");
    }
}

public class PolymorphicArray {
    public static void main(String[] args) {
        
        Superclass[] arr = new Superclass[2];

        
        arr[0] = new Subclass1();
        arr[1] = new Subclass2();
        
        for (Superclass obj : arr) {
            obj.display(); 
        }
    }
}