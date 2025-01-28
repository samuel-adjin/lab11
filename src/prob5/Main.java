package prob5;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static <T> T secondSmallest4(List<T> list, Comparator<T> comp) {
        T smallest = list.get(0);
        T secondSmallest = list.get(1);
        if (comp.compare(smallest, secondSmallest) > 0) {
            T temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for(int i = 2; i < list.size(); ++i) {
            T next = list.get(i);
            if (comp.compare(next, smallest) < 0) {
                secondSmallest = smallest;
                smallest = next;
            } else if (comp.compare(next, secondSmallest) < 0) {
                secondSmallest = next;
            }
        }

        return secondSmallest;
    }
}
