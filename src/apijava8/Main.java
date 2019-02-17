package apijava8;

public class Main {
    public static void main(String[] args){

        /**
         * Définit deux regles
         *
         * X > 5 & X < 20
         *
         * Return predicate is boolean
         *
         * in this example we implement our function of interface Predicate
         */

        /*Predicate<String> p1_lessthan20 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };*/

        Predicate<String> p1_lessthan20 = s -> s.length() < 20;

        Predicate<String> p2_greaterthan = s -> s.length() > 5;

        Predicate<String> p3_and = p1_lessthan20.and(p2_greaterthan);

        // Example for and
        System.out.println("p3_and : > 5 and < 20 ===> " + p3_and.test("hel"));

        Predicate<String> p4_or = p1_lessthan20.or(p2_greaterthan);

        // Example for or
        System.out.println("p4_or : > 5 or < 20 ===> " + p4_or.test("he"));

        Predicate<String> p5_equals = Predicate.isEqualsTo("yes");

        // Example for equals
        System.out.println("p5_equals for yes ===> " + p5_equals.test("yes"));
        System.out.println("p5_equals for no ===> " + p5_equals.test("no"));
    }
}
