public class StandardClient extends Client{
    public StandardClient(String name, String password){
        super(name, password);
    }

    @Override
    public String getClientType(){
        return "Standard";
    }
    
}