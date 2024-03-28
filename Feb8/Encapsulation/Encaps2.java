package Feb8.Encapsulation;
import java.util.*;
public class Encaps2 {
    public static void main(String[] args) {
     BankAccount obj=new BankAccount();
     obj.setAccountName("Meghna");
     obj.setBalance(100000);

     String name= obj.getAccountName();
     double balance=obj.getBalance();

        System.out.println("Account Name: "+ name);
        System.out.println("Balance: "+ balance);
    }
}
class BankAccount{
    private String accountName;
    private double balance;

    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}
