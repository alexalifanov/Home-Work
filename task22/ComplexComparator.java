package task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexComparator {
    public static void main(String[] args) {
        List<Person> human = new ArrayList<>();
        human.add(new Person("Рафаэль", 33));
        human.add(new Person("Александр", 25));
        human.add(new Person("Павел", 27));
        human.add(new Person("Динар", 40));
        Collections.sort(human, new PersonSuperComparator());
        for (Person person : human) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
