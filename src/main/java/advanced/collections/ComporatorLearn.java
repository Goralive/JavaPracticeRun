package advanced.collections;

import java.util.*;

public class ComporatorLearn {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("z");
        animals.add("anakonda");

        Collections.sort(animals, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(animals);
    }
}


