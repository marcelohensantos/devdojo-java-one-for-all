package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.print("username: ");
        String typedUsername = scanner.nextLine();

        System.out.print("password: ");
        String typedPassword = scanner.nextLine();

        if (!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)) {
            throw new LoginInvalidException("username or password invalid!");
        }
        System.out.println("login completed!");
    }
}
