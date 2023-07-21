package day10.practice;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
    public UserAlreadyExistsException(Throwable ex) {
        super(ex);
    }
    public UserAlreadyExistsException(String message,Throwable ex) {
        super(message,ex);
    }
}
