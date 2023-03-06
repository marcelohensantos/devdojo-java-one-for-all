package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer " + (end - begin) + " ms");
    }

    public static void concatString(int size) {
        String text = "Hy my name is William ";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    public static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder();
        text.append("Hy my name is William ");
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    public static void concatStringBuffer(int size) {
        StringBuffer text = new StringBuffer();
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
