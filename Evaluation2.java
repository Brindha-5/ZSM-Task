/*
What is the value of x1 if x=5 ?
x1=++x – x++ + –x
 */
package exercise;
import java.util.Scanner;
public class Evaluation2 {
    void display()
    {
        int x;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the x value");
        x=ip.nextInt();
        x=x++*2+3* -x;
        System.out.println("After the evalution xis"+x);
    }
}
class Evalvate2
{
    public static void main(String[] args) {
        Evaluation2 e=new Evaluation2();
        e.display();
    }
}
