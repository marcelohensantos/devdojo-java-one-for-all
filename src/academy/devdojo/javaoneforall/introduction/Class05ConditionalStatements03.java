package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // if salary > 2000 "buy PS5" "don't buy PS5"
        double salary = 3000D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";
        // (condition) ? <true> : <false>
        String showMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;
        System.out.println(showMessage);
    }
}
