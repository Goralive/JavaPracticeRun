package diffrenttasktest;

import diffrenttask.Palindrome;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @BeforeAll
    public void setUp () {
        Palindrome palindrome = new Palindrome("abba");
    }

    @Test
    public void isPalindromeTest () {

    }
}
