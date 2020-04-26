package advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 20, 2, 7};

        System.out.println(Arrays.toString(twoNumbers(arr, 9)));

        System.out.println(bob("1b33333333333333").size());
    }

    private static int [] twoNumbers(int[] arr, int i) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                int sum = arr[j] + arr[k];
                if (sum == i) {
                   int[] temp = {k,j};

                    return temp;
                }
            }
        }
        return null;
    }

    public static List<String> bob(String s){
        if(1 < s.length() && s.length() < 16) {
            System.out.println("BOB");
            return new ArrayList<>();
        } else {
            System.out.println("Invalid string, lenght of string should be" +
                    "between 1 and 16");
            return new ArrayList<>();
        }
    }
}


