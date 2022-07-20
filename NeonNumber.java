package tuesday_12;

import java.util.Scanner;

public class NeonNumber {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ip.nextInt();
        int sq=n*n;
        int temp=n,sum=0;
        while(temp>0)
        {
           int r=temp%10;
           sum=sum+r;
           temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not aneon number");
        }
    }

    public static void main(String[] args) {
        NeonNumber n=new NeonNumber();
        n.display();
    }

}
