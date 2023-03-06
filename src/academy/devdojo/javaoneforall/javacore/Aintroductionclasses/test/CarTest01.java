package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Ferrari";
        car1.model = "Enzo";
        car1.year = 2007;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;

        car2 = car1;

        System.out.println("\nname: " + car1.name);
        System.out.println("model: " + car1.model);
        System.out.println("year:" + car1.year);

        System.out.println("\nname: " + car2.name);
        System.out.println("model: " + car2.model);
        System.out.println("year:" + car2.year);
    }
}
