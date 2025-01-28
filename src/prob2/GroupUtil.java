package prob2;

import java.util.Arrays;
import java.util.List;

public class GroupUtil {
    	public static Group<?> copy(Group<?> group) {
		    return copyHelper(group);
	}

    	public static Group<?> copyHelper(Group<?> group) {
		List<?> elements = group.getElements();
            return new Group(group.getSpecialElement(), elements);
	}

    //Test using this main method
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4);
        Group<Integer> group = new Group<>(0, list);
        System.out.println(group);
        System.out.println(GroupUtil.copy(group));
    }
}
