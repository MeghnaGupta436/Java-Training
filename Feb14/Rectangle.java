package Feb14;
import java.util.*;
public class Rectangle {
    static Scanner sc=new Scanner(System.in);
    private double width;
    private double height;
    public double getwidth(){return width;}
    public double getHeight(){return height;}
    public void setWidth(double width){this.width=width;}
    public void setHeight(double height){this.height=height;}
    public double rectArea(){
        return height*width;}
    public double rectPeri(){
        return 2*(width*height);}
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(4,7);
        System.out.println("The area of Rectangle is: "+rect.rectArea());
        System.out.println("The perimeter of rectangle is: "+rect.rectPeri());

        rect.setWidth(7);
        rect.setHeight(12);
        System.out.println("The area of Rectangle is: "+rect.rectArea());
        System.out.println("The perimeter of rectangle is: "+rect.rectPeri());
    }
}
