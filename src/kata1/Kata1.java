package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Santi", new Date(103,0,14));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
