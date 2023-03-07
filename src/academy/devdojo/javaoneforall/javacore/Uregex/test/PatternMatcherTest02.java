package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String regex = "\\W";
        String text = "@!_hu 2\tuh231uh";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text : " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("positions found");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
