package tuesday_12;

import java.util.Scanner;

public class Pattern {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Entr the n value");
        int n=ip.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
               System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern p=new Pattern();
        p.display();
    }
}
