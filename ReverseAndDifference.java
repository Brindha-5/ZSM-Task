package exercise;
import java.util.Scanner;
interface DifferenceCalculation
{
    void toReverse(int number);
    void toCalculateDifference(int number);
}
public class ReverseAndDifference implements DifferenceCalculation {
int temp,reverse=0,remainder,difference;
    void startMethod()
    {
        int number;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Number to Reverse and calculate the difference");
        number = ip.nextInt();
        toReverse(number);
        toCalculateDifference(number);
    }
@Override
    public void toReverse(int number) {
        temp=number;
        while(temp!=0)
        {
            remainder=temp%10;
            reverse=reverse*10+remainder;
            temp=temp/10;
        }
        System.out.printf("The Reverse of %d is %d ",number,reverse);
}@Override
public void toCalculateDifference(int number)
{
    if(reverse==0)
    {
        System.out.println("Do deverse the number");
    }
    else
    {
        difference=number-reverse;
        System.out.printf("\n The difference between %d and %d is %d ",number,reverse,difference);
    }
    }
}
class Main
{
    public static void main(String[] args) {
        ReverseAndDifference object=new ReverseAndDifference();
        object.startMethod();
    }
}
