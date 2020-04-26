package advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearn {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(arrayList.size() - 1));

        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + ",");
        }
        System.out.println("\n");

        for (Integer i: arrayList) {
            System.out.print(i + ",");
        }

    }


}
