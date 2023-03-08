package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d - All the digits 0-9
        // \D - Everything that is not \d
        // \s - all the blank spaces \t \r \f \n
        // \S - everything that is not \s
        // \w - all the letters a-zA-Z, 0-9, _
        // \W - everything that is not \w
        // []
        // ? zero or one
        // * zero or more
        // + one or more
        // {n, .m} from n to m
        // ()
        // | person(a|s) persons or persona
        // $
        // . 1.3 123 133 1@3
        String regex = "([a-zA-z0-9\\._-])+@([a-zA-z])+(([\\.a-zA-z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.com, test@gmail.com, sakura@gmail.com";

        String[] emails = text.split(",");
        System.out.println(emails[1].trim().matches(regex));

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
