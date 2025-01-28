package prob1;

import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        // error occurs here because it isn't covariant
//        List<Number> nums = ints;
//        nums.add(3.14);
    }
}
