package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Willian Suane";
        name.concat(" DevDojo");
        name.substring(0, 3);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" DevDojo").append("Academy").append(" Nice!");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        sb.setLength(0);
        System.out.println(sb);
    }
}
