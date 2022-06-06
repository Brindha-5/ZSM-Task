/*
Write a program to evaluate the polynomial equation
 */
package exercise;
import java.util.Scanner;
public class PolynomialEquation {
    void display()
    {
        double a,b,c,d,r1,r2;
        Scanner ip= new Scanner(System.in);
        System.out.println("Enter the a value");
        a=ip.nextDouble();
        System.out.println("Enter the b value");
        b=ip.nextDouble();
        System.out.println("Enter the c value");
        c=ip.nextDouble();
        d=b*b-4*a*c;
        r1=-b+Math.sqrt(d)/2*a;
        r2=-b-Math.sqrt(d)/2*a;
        System.out.println("Root 1 value is:"+r1);
        System.out.println("Root2 value is :"+r2);
    }
}
class Equation extends PolynomialEquation
{
    public static void main(String[] args) {
        Equation e=new Equation();
        e.display();
    }
}