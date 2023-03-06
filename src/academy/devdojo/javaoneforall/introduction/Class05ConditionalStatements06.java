package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements06 {
    public static void main(String[] args) {
        /*
         Using switch, print if the day is business day or weekend
         Giving the numbers 1 to 7, 1 being Sunday
        */
        byte day = 4;
        switch (day) {
            case 2, 3, 4, 5, 6 -> System.out.println("business day");
            case 1, 7 -> System.out.println("weekend");
            default -> System.out.println("invalid");
        }
    }
}
