package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("checking permission general");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("inside retrieveMaxDataSize in the interface");
    }
}
