package advanced.regular;

public class MatchTextTest {
    public static void main(String[] args) {
        /*
        \\d - one number
        \\w - one letter [a-zA-Z]

        + - 1 or more
        * - 0 or more
        ? - 0 or 1 symbols before

        (x|y|z) - or

        [a-zA-Z] - all english letters
        [0-9] equals \\d
        [^abc] - all symbols without abc [^a-z] - all letters

        . - any symbol

        {2} - 2 symbols before
        {2,} - 2 and more symbols
        {2,4} - from 2 till 4 symbols
         */

        String a = "-132";
        String b = "123";
        String c = "+123";

        System.out.println(a.matches("(-|\\+)?\\d+"));
        System.out.println(b.matches("(-|\\+)?\\d+"));
        System.out.println(c.matches("(-|\\+)?\\d+"));

        String d = "YBC31ybc12389";

        System.out.println(d.matches("[a-zA-Z31]+\\d+"));


        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.gov.ua";

        System.out.println(url.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(e.matches("http://www\\..+\\.(com|ua)"));

        String f = "123";
        System.out.println(f.matches("\\d{2,}"));
    }
}
