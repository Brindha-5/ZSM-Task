package tuesday_12;
import java.util.Scanner;

public class InversePattern {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ip.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=i)
                {
                    if(i%2!=0) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InversePattern pat=new InversePattern();
        pat.display();
    }
}
