package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Kami";
        professor.age = 150;
        professor.gender = 'M';

        System.out.println("name: " + professor.name + " age: "
                + professor.age + " gender: " + professor.gender);
    }
}
