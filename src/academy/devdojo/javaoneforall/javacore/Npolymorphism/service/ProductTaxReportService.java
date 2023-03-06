package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {
    public static void generateTaxReport(Product product) {
        System.out.println("starting the tax report");
        double taxValue = product.calculateTaxValue();
        System.out.println("computer: " + product.getName());
        System.out.println("price: " + product.getPrice());
        System.out.println("tax value: " + taxValue);

        if (product instanceof Tomato) {
            System.out.println(((Tomato) product).getBestConsumeBefore());
        }
    }
}
