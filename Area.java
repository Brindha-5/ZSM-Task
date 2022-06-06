/* Write a program to find the area of the square
 Write a program to find the area of the rectangle
Write a program to find the area of the cylinder */
package exercise;
import java.util.Scanner;
interface CalculateArea
{
    void areaSquare();
    void areaRectangle();
    void areaCylinder();
}
public class Area implements CalculateArea{
    @Override
    public void areaSquare() {
        float length,area;
        Scanner op=new Scanner(System.in);
        System.out.println("Enter Length of the Square");
        length=op.nextFloat();
        area=length*length;
        System.out.println("The Area of the Square is "+area);
    }
    @Override
    public void areaRectangle() {
        float length,area,br;
        Scanner op=new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle");
        length=op.nextFloat();
        System.out.println("Enter breadth of the Rectangle");
        br=op.nextFloat();
        area=length*br;
        System.out.println("The Area of the rectangle is "+area);
    }
    @Override
    public void areaCylinder() {
        double radius,height,area;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the Radius of the Cylinder");
        radius=ip.nextDouble();
        System.out.println("Enter the Height of the Cylinder");
        height=ip.nextDouble();
        area=(22*radius*radius*height)/7;
        System.out.println("Area of the Cylinder is"+area);
    }
}
class PrintArea extends Area{
    public static void main(String[] args) {
        PrintArea pa=new PrintArea();
        pa.areaSquare();
        pa.areaCylinder();
        pa.areaRectangle();
    }
}