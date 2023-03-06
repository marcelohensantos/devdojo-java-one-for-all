package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void print() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);

        if (this.salaries != null) {
            System.out.print("salaries: ");
            for (double salary : this.salaries) {
                System.out.print(salary + " ");
            }
            System.out.println();
        }
        calculateAndPrintAverageSalary();
    }

    public void calculateAndPrintAverageSalary() {
        if (this.salaries == null) return;

        for (double salary : this.salaries) {
            average += salary;
        }
        System.out.println("the average salary is " + average / this.salaries.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }
}
