package Feb9.Abstraction;
import java.util.*;
public class Abs_1_Animal {
    public static void main(String[] args){
        Animal obj1=new lion();
        obj1.sound();
        Animal obj2=new tiger();
        obj2.sound();
    }
}
abstract class Animal{
    public abstract  void sound();
}
class lion extends Animal{
    public void sound(){
        System.out.println("Lion Roars");
    }
}
class tiger extends Animal{
    public void sound(){
        System.out.println("Tiger  growls");
    }
}