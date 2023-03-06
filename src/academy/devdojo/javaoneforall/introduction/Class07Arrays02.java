package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char = '\0000' or ''
        // boolean = false
        // String = null
        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Hinata";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
