package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Levi,Eren,Mikasa,true,300";
        Scanner in = new Scanner(text);
        in.useDelimiter(",");

        while (in.hasNext()) {
            if (in.hasNextInt()) {
                int i = in.nextInt();
                System.out.println("int: " + i);
            } else if (in.hasNextBoolean()) {
                boolean b = in.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                System.out.println(in.next());
            }
        }
    }
}
