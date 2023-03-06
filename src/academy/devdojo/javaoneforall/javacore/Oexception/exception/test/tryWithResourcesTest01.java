package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Reader1;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Reader2;

import java.io.IOException;

public class tryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        try (Reader1 reader1 = new Reader1(); Reader2 reader2 = new Reader2()) {
        } catch (IOException e) {
        }
    }
}
