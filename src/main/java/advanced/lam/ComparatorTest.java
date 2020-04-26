package advanced.lam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Word");
        list.add("bob");
        list.add("Now");
        list.add("GoodBye");

        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        };

        list.sort(comparator);
        System.out.println(list);
    }
}
