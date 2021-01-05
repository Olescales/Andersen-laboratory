package lab.andersen.katokoleg.immutableclass;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public final class Person {

    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    private final List<Person> persons;

    public Person(String name, String surname, LocalDate birthDate, List<Person> persons) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return Collections.unmodifiableList(persons);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}