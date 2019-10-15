package codingbat;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeTagsTest {

    CodingBat codingBat = new CodingBat();

    @Test
    public void makeTagsTest() {
        assertEquals(codingBat.makeTags("i", "Yay"), "<i>Yay</i>");
    }

    @Test
    public void firstTwoTest() {
        assertEquals(codingBat.firstTwo("Hello"), "He");
        assertEquals(codingBat.firstTwo("X"), "X");
        assertEquals(codingBat.firstTwo(""), "");
        assertEquals(codingBat.firstTwo("ab"), "ab");
    }

    @Test
    public void firstHalfTest() {
        assertEquals(codingBat.firstHalf("WooHoo"), "Woo");
        assertEquals(codingBat.firstHalf("HelloWorld"), "Hello");
    }

    @Test
    public void withoutEndTest() {
        assertEquals(codingBat.withoutEnd("Hello"), "ell");
    }

    @Test
    public void comboString() {
        assertEquals(codingBat.comboString("Hello", "hi"), "hiHellohi");
        assertEquals(codingBat.comboString("hi", "Hello"), "hiHellohi");
        assertEquals(codingBat.comboString("aaa", "b"), "baaab");
    }

    @Test
    public void nonStart() {
        assertEquals("ellohere", codingBat.nonStart("Hello", "There"));
        assertEquals("avaode", codingBat.nonStart("java", "code"));
    }

    @Test
    public void left2() {
        assertEquals("lloHe", codingBat.left2("Hello"));
        assertEquals("Hi",codingBat.left2("Hi"));
    }

    @Test
    public void right2(){
        assertEquals("loHel",codingBat.right2("Hello"));
        assertEquals("Hi",codingBat.left2("Hi"));

    }

    @Test
    public void theEnd(){
        assertEquals("H", codingBat.theEnd("Hello",true));
        assertEquals("o",codingBat.theEnd("Hello",false));
    }
}
