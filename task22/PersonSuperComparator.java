package task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        String p1 = person1.getName();
        String p2 = person2.getName();
        int sCompare = p1.compareTo(p2);
        if (sCompare != 0){
            return sCompare;
        } else {
            Integer i1 = person1.getAge();
            Integer i2 = person2.getAge();
            return i1.compareTo(i2);
        }
    }
}
