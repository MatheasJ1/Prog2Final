import java.time.*;
import java.time.temporal.ChronoUnit;
public class InvestmentAccount extends Account implements InterestBearing{
    private boolean isVIP;
    public InvestmentAccount(boolean isVIP){
        this.isVIP = isVIP;
    }

    @Override
    public void applyInterest(){
        double rate = 0.05;
        if(isVIP) rate += 0.01;
        balance += balance * rate;
    }
    @Override
    public void withdraw(double amount){
        throw new UnsupportedOperationException("Withdrawals are not allowed from Investment Accounts.");
    }
    public void transferToChequeing(Account chequeing, double amount)
        throws InvestmentLockException, InsufficientFundsException{
        
        if(ChronoUnit.DAYS.between(openingDate,LocalDate.now()) < 365){
            throw new InvestmentLockException();
        }

        if(balance < amount){
            throw new InsufficientFundsException();
        }

        balance -= amount;
        chequeing.deposit(amount);
}
}