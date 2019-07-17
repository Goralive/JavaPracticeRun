package diffrenttask;

import java.util.HashSet;

/**
 * Find the number of different array elements.
 */

public class ArrayElements {

    HashSet uniqueItems = new HashSet();
    public int sameElements(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            uniqueItems.add(numbers[i]);
        }
        return uniqueItems.size();
    }
}
