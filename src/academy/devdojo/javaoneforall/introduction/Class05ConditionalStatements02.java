package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category masters
        int age = 20;
        String category = "";
        if (age < 15) {
            category = "category junior";
        } else if (age >= 15 && age < 18) {
            category = "category senior";
        } else {
            category = "category master";
        }
        System.out.println(category);
    }
}
