public class PremiumClient extends Client{
    public PremiumClient(String name, String password){
        super(name, password);
    }

    @Override
    public String getClientType(){
        return "Premium";
    }
}