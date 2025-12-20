/* 
Design an immutable class with final attributes. Ensure that the class
cannot be modified once an object is created.
*/
 final class Person {
    private final String name;
    private final int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Person p = new Person("Ashish", 19);
        System.out.println(p.getName()); 
        System.out.println(p.getAge());  
    }
}