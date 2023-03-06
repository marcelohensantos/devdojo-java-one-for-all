package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("welcome to the most advanced AI system MIA");
        System.out.println("ask any question and I shall reply yes or no");

        String question = in.nextLine();

        if (question.charAt(0) == ' ') {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
