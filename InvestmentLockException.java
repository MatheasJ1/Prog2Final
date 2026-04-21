public class InvestmentLockException extends Exception{
    public InvestmentLockException(){
        super("Funds locked for 1 year");
    }
}