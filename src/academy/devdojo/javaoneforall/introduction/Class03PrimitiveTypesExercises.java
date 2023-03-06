package academy.devdojo.javaoneforall.introduction;

/*
Create variables for the fields described below between <> and print the following message:

I <name>, living <address> confirm, that I received the <salary> on <date>.
 */
public class Class03PrimitiveTypesExercises {
    public static void main(String[] args) {
        String name = "Marcelo Henrique";
        String address = "340, Mourne Road";
        double salary = 101.77;
        String receivedSalaryDate = "8th September 2022";

        String report = "I " + name + ", living at " + address + " confirm that I received the " + salary + " on " + receivedSalaryDate;

        System.out.println(report);
    }
}
