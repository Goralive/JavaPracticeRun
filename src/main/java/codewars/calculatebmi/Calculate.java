package codewars.calculatebmi;

// mass index (bmi = weight/height^2)
public class Calculate {

    public static String bmi(int weight, double height) {
        double underweight = 18.5;
        double normal = 25.0;
        double overweight = 30.0;
        double temp = Double.valueOf(weight);

        double bmiValue =  temp / Math.pow(height, 2.0);

        if (bmiValue <= underweight) {
            return "Underweight";
        } else if (bmiValue <= normal) {
            return "Normal";
        } else if (bmiValue <= overweight) {
            return "Overweight";
        }
        else if (bmiValue > overweight) {
            return  "Obese";
        }
        return "";
    }

}
