package apijava8;

public class Main {
    public static void main(String[] args){
        //Predicate<String> p1 = s -> s.length() < 20;

        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };
       // Predicate<String> p1 = s -> s.length() < 20;

        Predicate<String> p2 = s -> s.length() > 5;

        Predicate<String> p3 = p1.and(p2);

        System.out.println("p3 for yes " + p3.test("hello0"));

        Predicate<String> p4 = p1.or(p2);

        System.out.println("p3 for yes " + p3.test("hello0"));

        Predicate<String> p5 = Predicate.isEqualsTo("yes");
        System.out.println("p3 for yes " + p5.test("yes"));
        System.out.println("p3 for no " + p5.test("no"));
    }
}
