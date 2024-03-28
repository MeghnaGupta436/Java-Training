import java.util.*;
public class Abs_4_Animals {
    public static void main(String[] args){

        Lion obj1=new Lion();
        Tiger obj2=new Tiger();
        Deer obj3=new Deer();

        System.out.println("Lion: "+ obj1.eat()+"  "+ obj1.sleep());
        System.out.println("Tiger: "+obj2.eat()+"  "+obj2.sleep());
        System.out.println("Deer: "+obj3.eat()+"  "+obj3.sleep());
    }
}
abstract class Animals{
    public abstract String eat();
    public abstract String sleep();
}
class Lion extends Animals{
    public  String eat(){
        return "Meat";
    }
    public String sleep(){
        return "Jungle";
    }
}
class Tiger extends Animals{
    public  String eat(){
        return "Meat";
    }
    public String sleep(){
        return "Cave";
    }
}
class Deer extends Animals{
    public  String eat(){
        return "Grass";
    }
    public String sleep(){
        return "Grassland";
    }
}