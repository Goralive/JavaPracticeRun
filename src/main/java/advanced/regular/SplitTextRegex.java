package advanced.regular;

import java.util.Arrays;

public class SplitTextRegex {
    public static void main(String[] args) {

        String a = "Hello there my mate";
        String b = "bobby.Damn.Dammy";
        String[] words = a.split(" ");
        String[] words2 = b.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));

        String modifiedString = b.replaceAll("\\.", "-");
        System.out.println(modifiedString);
        String modifiedString2 = b.replaceFirst("\\.","   ");
        System.out.println(modifiedString2);
    }

}
