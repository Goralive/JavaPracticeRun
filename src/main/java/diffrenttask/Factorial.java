package diffrenttask;

public class Factorial {


    public int calculation(int number) {

        int result = 0;

        if (number <= 1) {
            result = 1;
        } else {
            result = number * calculation(number - 1);
        }
        System.out.println(result);
        return result;
    }
}
