package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        customCreatorFile();
    }

    public static void customCreatorFile() {
        File file = new File("folder/test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("file created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("outside custom file creator");
    }
}
