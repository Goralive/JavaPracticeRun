package diffrenttasktest;

import diffrenttask.Factorial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void initTest (){
        factorial = new Factorial();
    }

    @AfterEach
    public void afteerTest (){
        factorial = null;
    }

    @Test
    public void factorialTestPositive(){
        Assertions.assertEquals(120, factorial.calculation(5));
    }

    @Test
    public void factorialTestNegative(){
        Assertions.assertEquals(1,factorial.calculation(0));
    }
}
