/*
Given the radius of two concentric circle, find the area of the space between the
circles.
 */
package exercise;
import java.util.Scanner;
public class ConcentricCircle {
    void display()
    {
        float area;
        int r1,r2,r;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the first circle Radius");
        r1=ip.nextInt();
        System.out.println("Enter the second circle Radius");
        r2=ip.nextInt();
        r=(r1*r1)-(r2*r2);
        area=22*r/7;
        System.out.println("The Area of the Space between the Circles  "+area);
    }
}
class AreaOfConcentricCircle extends ConcentricCircle{
    public static void main(String[] args) {
        AreaOfConcentricCircle ac=new AreaOfConcentricCircle();
        ac.display();
    }
}