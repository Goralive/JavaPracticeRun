package codewars.calculatebmi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class CalculateBMITest {

    @Test
    public void positiveNormalBMItest() {
        assertEquals("Normal",Calculate.bmi(80,1.80));
    }

    @Test
    public void positiveUnderWeighttest() {
        assertEquals("Underweight",Calculate.bmi(40, 1.90));
    }

    @Test
    public void positiveOverweight(){
        assertEquals("Overweight",Calculate.bmi(90,1.80));
    }

    @Test
    public void positiveObese(){
        assertEquals("Obese",Calculate.bmi(120,1.80));
    }


}
