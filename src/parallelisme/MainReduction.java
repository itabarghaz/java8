package parallelisme;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;




public class MainReduction {

    public static int reduce(List<Integer> values,
                             int valueIfEmpty,
                             BinaryOperator<Integer> reduction) {

        int result = valueIfEmpty;
        for (int value : values) {
            result = reduction.apply(result, value);
        }

        return result;
    }

    public static void main(String[] args) {


        List<Integer> int1 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> int2 = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> int3 = Arrays.asList(5, 6, 7, 8, 9);

        BinaryOperator<Integer> op = (i1, i2) -> i1 + i2; // (i1, i2) -> i1 :  associative reduction = parallelisme
        //BinaryOperator<Integer> op = (i1, i2) -> (i1 + i2) / 2  :  non associative reduction !=  parallelisme
        //BinaryOperator<Integer> op1 = (i1, i2) -> Integer.max(i1,i2); // (i1, i2) -> i1  associative reduction

        // parallel execution 2 CPU

        int reduction1 = reduce(int2,0,op);
        int reduction2 = reduce(int3,0,op);

        int result = reduce(Arrays.asList(reduction1,reduction2),0,op);
        //int result = reduce(int1,0,op);

        System.out.println(result);
    }
}
