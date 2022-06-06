/*Write a program to print the number 7.50 without using String.*/
package exercise;
public class PrintFloat {
   void floatPrint()
    {
        double f=7.50;
        System.out.printf("%.2f",f);
    }
}
class FloatDisplay
{
    public static void main(String[] args) {
        PrintFloat pf=new PrintFloat();
        pf.floatPrint();
    }
}
