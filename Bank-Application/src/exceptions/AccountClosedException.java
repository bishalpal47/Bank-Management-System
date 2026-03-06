package exceptions;

public class AccountClosedException extends Exception {
    public AccountClosedException(String mssg){
        super(mssg);
    }
}
