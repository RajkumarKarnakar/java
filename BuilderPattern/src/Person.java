import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate birthDate;
    private final String email;
    private final String phone;

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.middleName = personBuilder.middleName;
        this.lastName = personBuilder.lastName;
        this.birthDate = personBuilder.birthDate;
        this.email = personBuilder.email;
        this.phone = personBuilder.phone;
        if (firstName == null || lastName == null)
            throw new IllegalArgumentException("Name and lastName cannot be null");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private LocalDate birthDate;
        private String email;
        private String phone;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder dateOfBirth(LocalDate dob) {
            this.birthDate = dob;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}












