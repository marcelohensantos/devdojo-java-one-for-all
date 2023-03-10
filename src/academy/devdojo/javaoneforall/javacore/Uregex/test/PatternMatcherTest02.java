package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d - all the digits 0-9
        // \D - everything that is not \d
        // \s - all the blank spaces \t \r \f \n
        // \S - everything that is not \s
        // \w - all the letters a-zA-Z, 0-9, _
        // \W - everything that is not \w
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
