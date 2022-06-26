import java.util.*;
public class MissingNumber {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        int a[]=new int[50];
        int n;
        System.out.println("Enter the number of elements");
        n=ip.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        int sum=(n*(n+1))/2;
        int sum1=0;
        for(int i=0;i<n;i++)
        {
           sum1=sum1+a[i];
        }
        int missnum=sum-sum1;
        System.out.println(missnum);
    }

    public static void main(String[] args) {
        MissingNumber mn=new MissingNumber();
        mn.display();
    }
}
