import java.util.Scanner;

public class ArrayDivision {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=ip.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the Array values");
        for(int i=0;i<n;i++)
        {
            array[i]=ip.nextInt();
        }
        System.out.println("Enter target value");
        int k=ip.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((array[i]+array[j])%k==0)
                {
                    System.out.println("["+array[i]+" ,"+array[j]+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayDivision ad=new ArrayDivision();
        ad.display();
    }
}
