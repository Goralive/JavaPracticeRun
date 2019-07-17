package diffrenttasktest;

import diffrenttask.Factorial;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void initTest (){
        factorial = new Factorial();
    }

    @After
    public void afteerTest (){
        factorial = null;
    }

    @Test
    public void factorialTestPositive(){
        Assert.assertEquals("Expected diffrenttask",120, factorial.calculation(5));
    }

    @Test
    public void factorialTestNegative(){
        Assert.assertEquals(1,factorial.calculation(0));
    }
}
