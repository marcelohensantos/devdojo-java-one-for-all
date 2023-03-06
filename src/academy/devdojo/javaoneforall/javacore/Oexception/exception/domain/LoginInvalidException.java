package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("invalid login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
