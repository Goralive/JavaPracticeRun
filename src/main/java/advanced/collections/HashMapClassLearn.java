package advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapClassLearn {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "Second");
        map.put(3, "Third");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(map);
    }
}
