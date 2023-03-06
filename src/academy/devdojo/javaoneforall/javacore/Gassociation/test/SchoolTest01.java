package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("Kakashi");
        Professor[] professors = {professor, professor1};

        School school = new School("Konoha", professors);
        school.print();
    }
}
