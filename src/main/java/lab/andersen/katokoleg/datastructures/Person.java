package lab.andersen.katokoleg.datastructures;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
