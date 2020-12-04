package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Alejandro David Sánchez Marrero", LocalDate.of(2000, Month.DECEMBER, 29));
        System.out.println("Nombre: " + person.getName() + "\n" +
                           "Edad: " + person.getAge() + "\n" +
                           "Cumpleaños: " + person.getBirthdate());
    }
    
}
