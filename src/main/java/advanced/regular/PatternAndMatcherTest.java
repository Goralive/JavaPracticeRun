package advanced.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherTest {
    public static void main(String[] args) {
        String text = " But Google Voice SMS-to-email forwarding bobby@gmail.com may be overkill if you're only interested in sending email" +
                " to yourself, since any text messages other people send to your Voice number will also end up in your " +
                "inbox. That may be more inbox clutter than jackson@google.com you're interested in. You could always set up filters, " +
                "but that starts to get rather convoluted. Instead, consider the following solution:";

        Pattern email = Pattern.compile("(\\w+)@(google|gmail)\\.com");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
