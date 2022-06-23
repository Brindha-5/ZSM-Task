import java.util.Scanner;

public class SumofSubArray {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n,i,j;
        int max=0,sum=0;
        int a[]=new int[10];
        System.out.println("Enter the n value");
        n=ip.nextInt();
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                sum=sum+a[j];
            }
            if(max<sum)
            {
                max=sum;
            }
            sum=0;
        }
        System.out.print(max);
    }
}
