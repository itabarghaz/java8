package apijava8;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
    default Predicate<T> and(Predicate<T> other){
        // this.test(var1) < 20
        // other.test(var1) > 5
        return var1 -> this.test(var1) && other.test(var1);
    }
    default Predicate<T> or(Predicate<T> other){
        return var1 -> this.test(var1) || other.test(var1);
    }

    static Predicate<String> isEqualsTo(String string){
        return s -> s.equals(string);
    }

}
