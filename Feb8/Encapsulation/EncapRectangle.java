package Feb8.Encapsulation;
import java.util.*;
public class EncapRectangle {
    public static void main(String[] args){
        Rectangle obj=new Rectangle();

        obj.setLength(12);
        obj.setWidth(8);

        double length=obj.getLength();
        double width=obj.getWidth();

        System.out.println("Area of rectangle is "+ length*width);

    }
}
class Rectangle{
    private double length;
    private double width;

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

}
