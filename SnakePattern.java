package tuesday_12;
import java.util.Scanner;

public class SnakePattern {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ip.nextInt();
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*n-i;j++)
            {
                if(j>=n-i)
                {
                    if(i%2==0) {
                        System.out.print(k+" ");
                        k++;
                    }
                    else {
                        k--;
                        System.out.print(k+" ");
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            k=k+n;
        }
    }

    public static void main(String[] args) {
        SnakePattern s=new SnakePattern();
        s.display();
    }
}
