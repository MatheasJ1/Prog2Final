public class MissingChequeingException extends Exception {
    public MissingChequeingException() {
        super("Client does not have a chequeing account");
    }
}