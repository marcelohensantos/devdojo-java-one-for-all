package academy.devdojo.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            boolean exists = file.exists();
            System.out.println("exists: " + exists);
            System.out.println("path: " + file.getPath());
            System.out.println("absolute path: " + file.getAbsolutePath());
            System.out.println("is file: " + file.isFile());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if (exists) {
                boolean isDeleted = file.delete();
                System.out.println("isDeleted: " + isDeleted);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
