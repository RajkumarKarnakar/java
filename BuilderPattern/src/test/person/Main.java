package test.person;

import com.person.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("Hello world!");
            var person1 = new Person.PersonBuilder("Rakumar", null)
                    .dateOfBirth(LocalDate.of(2000, 3, 10))
                    .email("rajkumar@email.com")
                    .build();

            System.out.println(person1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void addToPerson(Person person) {

    }
}

