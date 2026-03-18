package exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String mssg) {
        super(mssg);
    }
}
