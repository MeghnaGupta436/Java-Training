package Feb9.Abstraction;
import java.util.*;
public class Abs_2_Shape {
    public static void main(String[] args){

 circle circle=new circle(5);//object of class circle
        System.out.println("Area of circle is "+ circle.calArea());
        System.out.println("Perimeter of Circle is "+circle.calPeri());

 Triangle tri=new Triangle(2,3,5,5,3);
        System.out.println("Area of triangle is "+tri.calArea());
        System.out.println("Perimeter of Triangle is "+tri.calPeri());
    }
}
abstract class shape {
    public abstract double calArea();

    public abstract double calPeri();
}
class circle extends shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
     public double calArea(){
        return Math.PI*radius*radius;
    }
    @Override
     public double calPeri() {
        return 2* Math.PI*radius;
    }
}
class Triangle extends shape{
    private double s1,s2,s3,base,height;
    public Triangle(double s1,double s2,double s3,double base,double height){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.base=base;
        this.height=height;
    }
    public double calArea(){
        return ( base* height)/2;
    }
    public double calPeri(){
       return s1+s2+s3;
    }
}
