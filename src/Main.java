import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){
        /*double d = 5_000_00;
        System.out.println(d);*/

        // Runnable
        /*Runnable o1 = compute(5);
        Runnable o2 = compute(6);

        o1.run();
        o2.run();*/

        // comparable

        /*@NotNull List<String> languages = new ArrayList<>();
        languages.add("python");
        languages.add("java");
        languages.add("c++");
        languages.add("c#");
        languages.add("c");*/

        /*System.out.println("Sort 1 : ");
        languages.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });

        for (String language:languages) System.out.println(language);*/

        /**
         * comparable lambda
         */

        /*System.out.println("Sort 2 : ");
        languages.sort((s,t1) -> t1.compareTo(s));
        languages.forEach(s -> System.out.println(s));*/

        /**
         *  Demo lambda
          */

       /* Demo square = (value) -> (value*value);
        Demo cube = (value) -> (value*value*value);
        System.out.println(square.compute(3));
        System.out.println(cube.compute(3));*/


        /**
         * Ajouter du package java.util.function
         * utilitaires interface fonctionnelles
         */

        /*Predicate<String> p = s -> s.length() == 4;
        System.out.println(p.test("sss"));*/


        /**
         * Stream for collection
         * Example 1
         */

        /*List<String> strings = Arrays.asList("First","Second","third");
        strings.forEach(System.out::println);
        strings.stream().forEach(s -> System.out.println(s));*/

        /**
         *
         * Stream for collection
         * Example 2
         *
         */

        /*List<String> strings = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");
        strings.stream()
                // filtrage
                .filter(x -> x.contains("cha"))
                // mapping : reformatage des chaînes de caractères
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                // tri par ordre alphabétique
                .sorted()
                // Outputs:
                // Cachalot
                // Chameau
                // Chat
                .forEach( System.out::println );*/

        /**
         * Date
         */
        LocalDate date =  LocalDate.of(2017, Month.AUGUST,31);
        date = date.plusDays(2);
        System.out.println(Month.AUGUST.getValue());
        System.out.println(date);
        System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
    }

    public static Runnable compute(int value){
        return () -> {System.out.println("ok "+ value);};
    }
}
