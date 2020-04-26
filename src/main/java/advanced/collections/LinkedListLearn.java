package advanced.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListLearn {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i++) {
            list.add(0 ,i);
        }
 //     for (int i = 0; i < 100000; i++) {
 //         list.get(i);
 //     }

        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName());
        System.out.println(end - start);
    }
}
