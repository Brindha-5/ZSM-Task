package tuesday_12;

import java.util.Scanner;

public class AmstorngNumber {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ip.nextInt();
        int s=n;
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
            sum=sum+(temp*temp*temp);
            n=n/10;
        }
        if(sum==s)
        {
            System.out.println("Amstrong number");
        }
        else
        {
            System.out.println("Not a Amstrong number");
        }
    }

    public static void main(String[] args) {
        AmstorngNumber n=new AmstorngNumber();
        n.display();
    }
}
