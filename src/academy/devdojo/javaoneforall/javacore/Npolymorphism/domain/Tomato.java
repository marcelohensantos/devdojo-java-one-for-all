package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;
    private String bestConsumeBefore;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("calculating tax value for tomato");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumeBefore() {
        return bestConsumeBefore;
    }

    public void setBestConsumeBefore(String bestConsumeBefore) {
        this.bestConsumeBefore = bestConsumeBefore;
    }
}
