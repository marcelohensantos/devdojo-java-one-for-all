package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements05 {
    public static void main(String[] args) {
        byte day = 5;
        // char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("sun");
                break;
            case 2:
                System.out.println("mon");
                break;
            case 3:
                System.out.println("tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thu");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("sat");
                break;
            default:
                System.out.println("invalid");
                break;
        }

        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("male");
                break;
            case 'F':
                System.out.println("female");
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }
}
