package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("please type your full name: ");
        String name = in.nextLine();

        System.out.print("please type your age: ");
        int age = in.nextInt();

        System.out.print("please type m or f for your gender: ");
        char gender = in.next().charAt(0);

        System.out.println("--- --- ---");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
    }
}
