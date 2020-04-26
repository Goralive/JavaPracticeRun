package advance;

import advanced.Vector2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private Vector2D v1;

    @BeforeEach
    void createNewVector() {
       v1 = new Vector2D();
    }

    @Test
    void newVectorShouldHaveZeroLength() {
        assertEquals(0, v1.length(), EPS);
    }

    @Test
    void shouldNotDivideOnZeroException() {
        var thrownException = assertThrows(ArithmeticException.class,
                () -> v1.divide(2, 0), "No Arithmetical exception while divide by zero");

        assertTrue(thrownException.getMessage().equals("Can't divide by zero"));
    }
}
