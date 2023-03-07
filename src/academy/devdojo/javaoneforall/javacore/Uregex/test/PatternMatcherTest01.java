package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        // String text = "abaaba";
        String text = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text : " + text);
        System.out.println("index: 0123456789");
        System.out.println("positions found");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
