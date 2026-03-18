package exceptions;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(String mssg) {
        super(mssg);
    }
}
