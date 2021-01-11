package lab.andersen.katokoleg.datastructures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTask {

    private static final Logger logger = LoggerFactory.getLogger(TreeMapTask.class);

    public static void main(String[] args) {

        Person person1 = new Person("Katok", "Oleg", 15);
        Person person2 = new Person("Nosikov", "Ivan", 25);
        Person person3 = new Person("Delinger", "Petr", 33);
        Person person4 = new Person("Petrik", "Sergey", 77);
        Person person5 = new Person("Ivanova", "Alisa", 4);
        Person person6 = new Person("Ivanova", "Veronika", 44);

        logger.info("-=TreeMapTask=-");
        logger.info("Uses black-red tree for storing elements");
        logger.info("Guaranteed access O(n)");
        logger.info("Store elements in sorted order using natural order");
        TreeMap<Person, Integer> treeMapWithComparable = new TreeMap<>();
        treeMapWithComparable.put(person1, person1.getAge());
        treeMapWithComparable.put(person3, person3.getAge());
        treeMapWithComparable.put(person2, person2.getAge());
        treeMapWithComparable.put(person4, person4.getAge());
        treeMapWithComparable.put(person5, person5.getAge());
        treeMapWithComparable.forEach((n, e) -> logger.info(n + " " + e));

        logger.info("Or Store elements in sorted order using comparator");
        TreeMap<Person, Integer> treeMapWithComparator = new TreeMap<>(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        treeMapWithComparator.put(person1, person1.getAge());
        treeMapWithComparator.put(person2, person2.getAge());
        treeMapWithComparator.put(person3, person3.getAge());
        treeMapWithComparator.put(person4, person4.getAge());
        treeMapWithComparator.put(person5, person5.getAge());
        treeMapWithComparator.put(person6, person6.getAge());
        treeMapWithComparator.keySet().forEach(p -> logger.info(p.getName() + p.getSurname()));

        logger.info("Not thread-safe");
    }
}