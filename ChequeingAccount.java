public class ChequeingAccount extends Account implements Maintainable{

    private boolean feeWaived;

    public ChequeingAccount(boolean feeWaived) {
        this.feeWaived = feeWaived;
    }
    @Override
    public void applyMonthlyFee(){
        if(!feeWaived){
        balance -= 10;
    }
}
}