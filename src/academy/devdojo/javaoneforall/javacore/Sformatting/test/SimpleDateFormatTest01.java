package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'of' MMMM',' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Amsterdam 11 of dezembro, 2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
