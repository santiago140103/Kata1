package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate date) {
        this.name = name;
        this.birthdate = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return birthdate;
    }
    
    public int getAge() {
        return (int)(Period.between(birthdate, LocalDate.now()).getYears());
    }
    
    
    
}

