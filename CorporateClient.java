public class CorporateClient extends PremiumClient{
    public CorporateClient(String name, String password){
        super(name, password);
    }
    public boolean isVIP(){
        return false;
    }
    public boolean feeWaived(){
        return false;
    }
}