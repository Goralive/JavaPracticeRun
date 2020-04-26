package diffrenttasktest;

import diffrenttask.ArrayElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayElementsTest {

    ArrayElements arrayElements = new ArrayElements();

    @Test
    public void posArrayElementTest (){
        int [] testArray = {1,4,5,1,1,3};
        assertEquals(arrayElements.sameElements(testArray),4);
    }
}
