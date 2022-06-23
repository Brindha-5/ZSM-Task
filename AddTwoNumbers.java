import java.util.Scanner;
public class AddTwoNumbers {
public void addTwoNumbers()
{
        int n;
        int a[]=new int[15];
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        n=ip.nextInt();
        System.out.println("Enter Values");
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        System.out.println("l2");
        int n2;
        int b[]=new int[20];
        System.out.println("Enter no elements");
        n2=ip.nextInt();
        System.out.println("Enter values of l2");
        for(int i=0;i<n2;i++)
        {
            b[i]=ip.nextInt();
        }
        int sum=0,sum1=0,total=0;
for(int i=n-1;i>=0;i--)
{
    sum=sum*10+a[i];
}
        for(int i=n2-1;i>=0;i--)
        {
            sum1=sum1*10+b[i];
        }
        total=sum1+sum;
        int i=0,count=0;
        int result[]=new int[10];
        while(total>0)
        {
            result[i++]=total%10;
            total=total/10;
            count++;
        }
        for(i=0;i<count;i++)
        {
            System.out.print(result[i]);
        }
}
    public static void main(String[] args) {
    AddTwoNumbers at=new AddTwoNumbers();
    at.addTwoNumbers();
    }
}
