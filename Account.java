import java.time.*;
public abstract class Account{
    protected String accountNumber;
    protected double balance;
    protected LocalDate openingDate;

    public Account(){
        this.accountNumber = IDGenerator.generateAccountID();
        this.balance = 0.0;
        this.openingDate = LocalDate.now();
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void deposit(double amount, String note){
        balance+=amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException();
        }
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}