package lab.andersen.katokoleg.immutableclass;

import java.time.LocalDate;
import java.util.ArrayList;
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
        List<Person> newPersons = new ArrayList<>();
        persons.forEach(p -> newPersons.add(p));
        this.persons = newPersons;
    }

    public List<Person> getPersons() {
        List<Person> newPersons = new ArrayList<>();
        persons.forEach(p -> newPersons.add(p));
        return newPersons;
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