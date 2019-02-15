package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainApiCollection {
    public static void main(String[] arg){
        Person p1 = new Person("Tarik",25);
        Person p2 = new Person("Mohamed",17);
        Person p3 = new Person("Ahmed",40);

        List<Person> people = new ArrayList(Arrays.asList(p1,p2,p3));

        people.removeIf(p -> p.age < 20);

        people.replaceAll(p -> new Person(p.name.toUpperCase(),p.age));

        people.sort(Comparator.comparing(Person::getAge).reversed());

        people.forEach(System.out::println);
    }
}
