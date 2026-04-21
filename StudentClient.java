public class StudentClient extends StandardClient{
    public StudentClient(String name, String password){
        super(name, password);
    }
    public boolean isVIP(){
        return false;
    }
    public boolean feeWaived(){
        return true;
    }
}