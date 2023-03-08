package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// Buffered Writer
// Buffered Reader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("This is a message from DevDojo Academy <3\nThis is a new nice line!\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
