import java.util.Scanner;

public class CountAscending {
    void diplay()
    {
        int a[]=new int[15];
        int n,i,j;
        int count=0;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of element");
        n=ip.nextInt();
        System.out.println("Enter the value");
        for(i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                   // a[
                }
            }
        }

    }
    public static void main(String[] args) {
}
}