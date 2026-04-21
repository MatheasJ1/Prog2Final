import java.util.*;
public abstract class Client{
    protected String clientID;
    protected String name;
    protected String password;
    protected List<Account> accounts;

    public Client(String name, String password){
        this.clientID = IDGenerator.generateClientID();
        this.name = name;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public List<Account> getAccounts(){
        return accounts;
    }
    public String getClientID(){
        return clientID;
    }
    public boolean login(String id, String password){
        return clientID.equals(id) && password.equals(password);
    }
    public abstract String getClientType();

    @Override
    public String toString(){
        return clientID + " - " + name + " (" + getClientType() + ")";
    }
    public abstract boolean isVIP();
    public abstract boolean feeWaived();
}