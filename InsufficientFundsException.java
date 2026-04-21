public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Not enough balance");
    }
}