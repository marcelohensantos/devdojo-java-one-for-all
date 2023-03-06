package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("opening connection");
            System.out.println("writing to the database");
            if(true) {
                throw new RuntimeException();
            }
            return "connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("closing connection");
        }
        return "not connected";
    }
}
