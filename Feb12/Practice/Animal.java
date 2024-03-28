package Feb12.Practice;
import java.util.Scanner;
public class Animal {
    public void eat(){
        System.out.println("Animals eats different food");
    }
    public void sleep(){
        System.out.println("Animals have different sleep patterns");
    }
    public static void main(String[] args){
        Animal obj=new Animal();
        System.out.println("Welcome to animal world");
        obj.eat();
        obj.sleep();
    }
}
