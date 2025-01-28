package prob1;

import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        // error occurs here because when you use ? extend Number you are unable to add to the list as the compiler is not able
        // to determine the subtype of Number
//        nums.add(3.14);
    }
}
