package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("removing data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the database");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("inside retrieveMaxDataSize in the class Database");
    }
}
