/* Write a program to print the following pattern based on the alphabet.
Example 1:
Input: E
Output:
EEEEE
DDDD
CCC
BB
A*/
package exercise;
import java.util.Scanner;
interface PatternPrinting
{
    void printPattern(int num);
    void printPattern(char ch);
}
public class Pattern implements PatternPrinting
{
    @Override
    public void printPattern(int num) {
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    @Override
    public void printPattern(char ch) {
        int size=65,r;
        int alpha=ch;
        r=alpha-size;
        for(int i=r;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)alpha);
            }
            System.out.print("\n");
            alpha--;
        }
    }
    public void patternDisplay()
    {
        int num,choice;
        char ch;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the choice to display the pattern");
        System.out.println("Press 1 for Number Pattern ");
        System.out.println("Press 2 for Character Pattern ");
        choice=ip.nextInt();
        if(choice==1)
        {
            System.out.println("Enter the number to print the number pattern");
            num=ip.nextInt();
            printPattern(num);
        }
        else if(choice==2)
        {
            System.out.println("Enter the number to print the n pattern");
            ch=ip.next().charAt(0);
            printPattern(ch);
        }
        else {
            System.out.println("Please Enter Correct Choice");
        }
    }
}
class PatternPrint {
    public static void main(String[] args) {
        Pattern object = new Pattern();
        object.patternDisplay();
    }
}