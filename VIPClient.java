public class VIPClient extends PremiumClient{
    public VIPClient(String name, String password){
        super(name, password);
    }
    public boolean isVIP(){
        return true;
    }
    public boolean feeWaived(){
        return true;
    }
}