public class SavingsAccount extends Account implements InterestBearing, Maintainable{
    private boolean feeWaived;
    private boolean isVIP;

    public SavingsAccount(boolean feeWaived, boolean isVIP){
        this.feeWaived = feeWaived;
        this.isVIP = isVIP;
    }

    @Override
    public void applyInterest(){
        double rate = 0.02;
        if(isVIP) rate += 0.01;
        balance += balance * rate;
    }
    @Override
    public void applyMonthlyFee(){
        if(!feeWaived){
        balance -= 10;
    }
}
}