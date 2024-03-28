package Feb9.Abstraction;
import java.util.*;
public class Abs_3_bankAcc {
    public static void main(String[] args){
        SavingAcc save=new SavingAcc(30000,2000);
        CurrentAcc curt=new CurrentAcc(20000,40000);
        System.out.println("Saving account info:\n Savings: "+ save.deposit()+"\n Withdrawn: "+ save.withdraw());
        System.out.println("current account info\n Savings: "+curt.deposit()+"\n Withdrawn: "+curt.withdraw());
    }
}
abstract class BankAccount{
    public abstract double deposit();
    public abstract double withdraw();
}

class SavingAcc extends BankAccount{
    private double saving,withdraw;
    public SavingAcc(double saving,double withdraw){
        this.saving=saving;
        this.withdraw=withdraw;
    }
    public double deposit(){
        return saving;
    }
    public double withdraw(){
        return withdraw;
    }
}
class CurrentAcc extends BankAccount{
    private double save,withdraw;
    public CurrentAcc(double save,double withdraw){
        this.save=save;
        this.withdraw=withdraw;
    }
    public double deposit(){
      return save;
    }
    public double withdraw(){
        return withdraw;
    }
}