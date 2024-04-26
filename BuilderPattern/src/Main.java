import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var person1 = new Person.PersonBuilder("Rakumar","Karnakar")
                .dateOfBirth(LocalDate.of(2000,3,10))
                .email("rajkumar@email.com")
                .build();

        System.out.println(person1);
    }
}

