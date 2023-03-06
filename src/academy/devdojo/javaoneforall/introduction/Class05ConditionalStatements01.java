package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        int age = 5;
        boolean isAllowedToBuyAlcohol = age >= 18;
        if (isAllowedToBuyAlcohol) {
            System.out.println("authorized to buy alcohol");
        } else {
            System.out.println("sorry, you are not authorized to buy alcohol");
        }
        // !
        if (!isAllowedToBuyAlcohol) {
            System.out.println("sorry, you are not authorized to buy alcohol");
        }
    }
}
