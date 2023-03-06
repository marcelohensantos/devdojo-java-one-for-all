package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("-----");
        System.out.println("professor's name: " + name);
        System.out.println("professor's research field: " + researchField);

        if (seminars == null) return;
        System.out.println("#####");
        for (Seminar seminar : seminars) {
            System.out.println("seminar title:  " + seminar.getTitle());
            System.out.println("happening at: " + seminar.getPlace().getAddress());

            if (seminar.getStudents() == null || seminar.getStudents().length == 0) continue;
            System.out.println("****** students ******");
            for (Student student : seminar.getStudents()) {
                System.out.println("student's name: " + student.getName());
                System.out.println("student's age: " + student.getAge());
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
