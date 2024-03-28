package Feb14;
import java.util.*;
public class Circle {
    Scanner sc=new Scanner(System.in);
    private double radius;
    Circle (double radius){
        this.radius=radius;
    }
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius=radius;}
    public double circumfrence(){
        return 3.14*radius *radius;
    }
    public static void main(String[] args){
        Circle obj=new Circle(7);
        System.out.println("The circumfrence is :"+obj.circumfrence());
        obj.setRadius(9);
        System.out.println("The circumfrence is :"+obj.circumfrence());
        obj.setRadius(3);
        System.out.println("The circumfrence is :"+obj.circumfrence());
    }
}
