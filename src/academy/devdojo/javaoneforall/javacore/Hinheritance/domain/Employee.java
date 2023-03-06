package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    static {
        System.out.println("inside employee static init block");
    }

    {
        System.out.println("inside employee init block 1");
    }

    {
        System.out.println("inside employee init block 2");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("inside employee constructor");
    }

    public Employee(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.salary);
        System.out.println(this.address.getAddress() + " " + this.address.getZipcode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
