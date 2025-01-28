package prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }
    public static void main(String[] args) {
        //prob4A
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        List<? extends Number> nums = ints;
//        double dbl = sum(nums);
//        // Error occurs here as ? extends Number does allow to add to the list as compiler is unable to determine the exact subtype the list
//        // is referring to
////        nums.add(3.14);


        //prob4B
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3);
        //error occurs here
//        double dbl = sum(ints);

    }
}
