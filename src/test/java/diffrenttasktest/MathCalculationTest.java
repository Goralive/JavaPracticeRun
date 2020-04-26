package diffrenttasktest;

import diffrenttask.MathCalculation;
import org.junit.jupiter.api.Test;

public class MathCalculationTest {

    MathCalculation math = new MathCalculation(7,7);

    @Test
    public void equalTest () {
        math.biggerNumber();
    }
}
