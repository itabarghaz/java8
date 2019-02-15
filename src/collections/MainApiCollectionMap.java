package collections;

import java.util.*;
import java.util.stream.Collectors;

public class MainApiCollectionMap {
    public static void main(String[] arg){
        Person p1 = new Person("Tarik",25);
        Person p2 = new Person("Mohamed",17);
        Person p3 = new Person("Ahmed",40);
        Person p4 = new Person("Said",12);
        Person p5 = new Person("Rabii",70);

        City newYork = new City("New York");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");

        Map<City,List<Person>> map1 = new HashMap<>();

        /*map.putIfAbsent(paris,new ArrayList<>());
        map.get(paris).add(p1);*/

        map1.computeIfAbsent(newYork,city -> new ArrayList<>()).add(p1);
        map1.computeIfAbsent(shanghai,city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(shanghai,city -> new ArrayList<>()).add(p3);
        System.out.println("Map 1");
        map1.forEach((city,people) -> System.out.println(city +" : "+ people));

        /*System.out.println(map1.getOrDefault(paris, Collections.EMPTY_LIST));
        System.out.println(map1.getOrDefault(newYork, Collections.EMPTY_LIST));*/

        Map<City,List<Person>> map2 = new HashMap<>();
        map2.computeIfAbsent(shanghai,city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris,city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris,city -> new ArrayList<>()).add(p5);

        System.out.println("Map 2");
        map2.forEach((city,people) -> System.out.println(city +" : "+ people));


        // A revoir
        map2.forEach(
                (city, people) -> {
                    map1.merge(
                            city,people,
                            (peopleFromMap1,peopleFromMap2) -> {
                                peopleFromMap1.addAll(peopleFromMap2);
                                return peopleFromMap1;
                            }
                    );
                }
        );

        System.out.println("Margin Map 1 ");
        map1.forEach((city,people) -> System.out.println(city +" : "+ people));

    }
}
