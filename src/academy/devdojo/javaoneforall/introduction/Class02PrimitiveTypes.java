package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        int age = (int) 10000000000L;
        long bigNumber = (long) 155.35;
        float salaryFloat = (float) 2500.0D;
        double salaryDouble = 2500;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = -128;
        char character = '\u0041';
        String name = "Goku";
        var address = "439 East District";

        System.out.println("The age is " + age + " years old");
        System.out.println(character);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
        System.out.println("Hi, I am " + name);
    }
}
