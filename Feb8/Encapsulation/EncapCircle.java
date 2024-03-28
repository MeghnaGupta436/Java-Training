package Feb8.Encapsulation;
import java.util.*;
public class EncapCircle {
    public static void main(String[] args){
        Circle obj=new Circle();

        obj.setRadius(7);
        double radius=obj.getRadius();
        System.out.println(radius);
        System.out.println(obj.calArea());
        System.out.println(obj.calPeri());
    }
}
class Circle{
    private double radius;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double calArea(){
        return 3.14*getRadius()*getRadius();
    }
    public double calPeri(){
        return 2*3.14*getRadius();
    }

}
